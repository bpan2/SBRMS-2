package com.sbrms.data.dao

import androidx.room.*
import com.sbrms.data.model.Employee
import kotlinx.coroutines.flow.Flow

@Dao
interface EmployeeDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(employee: Employee)

    @Update
    suspend fun update(employee: Employee)

    @Delete
    suspend fun delete(employee: Employee)

    @Query("SELECT * FROM employee_table WHERE employeeID = :id")
    fun getEmployee(id: Int): Flow<Employee>

    @Query("SELECT * FROM employee_table")
    fun getAllEmployees(): Flow<List<Employee>>
}