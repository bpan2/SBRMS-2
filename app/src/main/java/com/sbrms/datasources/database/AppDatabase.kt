package com.sbrms.datasources.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.sbrms.data.dao.EmployeeDao
import com.sbrms.data.model.Employee
import com.sbrms.data.model.Product

@Database(entities = [Employee::class, Product::class, ], version = 1)
abstract class AppDatabase : RoomDatabase(){
    abstract fun employeeDao() : EmployeeDao
}