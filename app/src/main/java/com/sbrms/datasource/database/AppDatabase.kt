package com.sbrms.datasource.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.sbrms.model.dao.EmployeeDao
import com.sbrms.model.entity.Employee
import com.sbrms.model.entity.Product

@Database(entities = [Employee::class, Product::class, ], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase(){
    abstract fun employeeDao() : EmployeeDao
}