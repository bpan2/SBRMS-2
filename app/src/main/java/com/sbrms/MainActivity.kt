package com.sbrms

import android.app.ProgressDialog.show
import android.os.Bundle
import android.view.Menu
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.navigation.NavigationView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity
import com.sbrms.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.appBarMain.toolbar)

        //getSupportActionBar()?.setDisplayHomeAsUpEnabled(false)
        //getSupportActionBar()?.setDisplayShowHomeEnabled(false)

        binding.appBarMain.fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
        val drawerLayout: DrawerLayout = binding.drawerLayout
        val navView: NavigationView = binding.navView

        /*
        https://stackoverflow.com/questions/51173002/how-to-change-start-destination-of-a-navigation-graph-programmatically
        val navController = findNavController(R.id.nav_host_fragment)
        if (condition) {
            navController.setGraph(R.navigation.nav_graph_first)
        } else {
            navController.setGraph(R.navigation.nav_graph_second)
        }

        val nextDestination = if (loginSuccess) {
                R.id.action_Dashboard
            } else {
                R.id.action_NotAuthorized
            }

        val options = NavOptions.Builder()
            .setPopUpTo(R.id.loginParentFragment, true)
            .build()

        findNavController().navigate(nextDestination, null, options)
         */


        val navController = findNavController(R.id.nav_host_fragment_content_main)
        navController.setGraph(R.navigation.mobile_navigation)

        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(setOf(
            R.id.nav_home,
            R.id.nav_gallery,
            R.id.nav_slideshow,
            R.id.receivingFragment,
            R.id.salesFragment,
            R.id.returnedFragment,
            R.id.employeeFragment,
            R.id.loginFragment),
            drawerLayout)
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }


    override fun onBackPressed() {

        // To execute back press
        // super.onBackPressed()

        // To do something else
        Snackbar.make(binding.root, "Please use the hamburger button", Snackbar.LENGTH_SHORT).show()
        //Toast.makeText(applicationContext, "Please use hamburger button", Toast.LENGTH_SHORT).show()
    }
}