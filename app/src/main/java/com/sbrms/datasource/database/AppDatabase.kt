package com.sbrms.datasource.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.sbrms.model.dao.EmployeeDao
import com.sbrms.model.entity.Employee
import com.sbrms.model.entity.Product
import com.sbrms.utilities.DATABASE_NAME

@Database(entities = [Employee::class, Product::class], version = 1, exportSchema = false)
public abstract class AppDatabase : RoomDatabase(){
    abstract fun employeeDao() : EmployeeDao

    //The following comes from https://developer.android.com/codelabs/android-room-with-a-view-kotlin#7
    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            // if the INSTANCE is not null, then return it,
            // if it is, then create the database
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    DATABASE_NAME
                ).build()
                INSTANCE = instance
                // return instance
                instance
            }
        }
    }
}



/*Android Developer Res:
* https://developer.android.com/codelabs/android-room-with-a-view-kotlin#17
* */