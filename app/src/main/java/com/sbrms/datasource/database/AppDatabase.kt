package com.sbrms.datasource.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.sbrms.model.dao.EmployeeDao
import com.sbrms.model.entity.Employee
import com.sbrms.model.entity.Product

@Database(entities = [Employee::class, Product::class], version = 1, exportSchema = false)
public abstract class AppDatabase : RoomDatabase(){
    abstract fun employeeDao() : EmployeeDao

    companion object {
        // Singleton prevents multiple instances of database opening at the
        // same time.
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            // if the INSTANCE is not null, then return it,
            // if it is, then create the database
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "AppDatabase"
                ).build()
                INSTANCE = instance
                // return instance
                instance
            }
        }
    }
}