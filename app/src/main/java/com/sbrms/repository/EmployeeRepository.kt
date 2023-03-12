package com.sbrms.repository

import androidx.annotation.WorkerThread
import androidx.lifecycle.MutableLiveData
import com.sbrms.model.dao.EmployeeDao
import com.sbrms.model.entity.Employee
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject


class EmployeeRepository @Inject constructor(
    private val employeeDao: EmployeeDao
    ) {
    val allEmployees: Flow<List<Employee>> = employeeDao.getAllEmployees()
    val currentEmployee = MutableLiveData<Employee>()

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(employee: Employee) {
        employeeDao.insert(employee)
    }

    companion object {
        // For Singleton instantiation
        @Volatile private var instance: EmployeeRepository? = null

        fun getInstance(employeeDao: EmployeeDao) =
            instance ?: synchronized(this) {
                instance ?: EmployeeRepository(employeeDao).also { instance = it }
            }
    }

}


//The above is following the example from this link: https://developer.android.com/codelabs/android-room-with-a-view-kotlin#8