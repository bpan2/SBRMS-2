package com.sbrms.repository

import androidx.annotation.WorkerThread
import com.sbrms.model.dao.EmployeeDao
import com.sbrms.model.entity.Employee
import kotlinx.coroutines.flow.Flow

class EmployeeRepository(private val employeeDao: EmployeeDao) {
    // Room executes all queries on a separate thread.
    // Observed Flow will notify the observer when the data has changed.
    val allEmployees: Flow<List<Employee>> = employeeDao.getAllEmployees()

    // By default Room runs suspend queries off the main thread, therefore, we don't need to
    // implement anything else to ensure we're not doing long running database work
    // off the main thread.
    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(employee: Employee) {
        employeeDao.insert(employee)
    }

}