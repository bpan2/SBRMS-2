package com.sbrms.repository

import androidx.annotation.WorkerThread
import com.sbrms.model.dao.EmployeeDao
import com.sbrms.model.entity.Employee
import kotlinx.coroutines.flow.Flow

class EmployeeRepository(private val employeeDao: EmployeeDao) {
    val allEmployees: Flow<List<Employee>> = employeeDao.getAllEmployees()

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(employee: Employee) {
        employeeDao.insert(employee)
    }

}


//The above is following the example from this link: https://developer.android.com/codelabs/android-room-with-a-view-kotlin#8