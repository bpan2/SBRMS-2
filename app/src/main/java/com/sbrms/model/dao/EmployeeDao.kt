package com.sbrms.model.dao

import androidx.room.*
import com.sbrms.model.entity.Employee
import kotlinx.coroutines.flow.Flow

@Dao
interface EmployeeDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(employee: Employee)

    @Update
    suspend fun update(employee: Employee)

    @Delete
    suspend fun delete(employee: Employee)

    @Query("DELETE FROM employee_table")
    suspend fun deleteAll()

    @Query("SELECT * FROM employee_table WHERE employeeID = :id")
    fun getEmployee(id: Int): Flow<Employee>

    @Query("SELECT * FROM employee_table ORDER BY employeeID ASC")
    fun getAllEmployees(): Flow<List<Employee>>
}