package com.sbrms.ui.employee

import androidx.lifecycle.*
import com.sbrms.model.entity.Employee
import com.sbrms.repository.EmployeeRepository
import kotlinx.coroutines.launch

class EmployeeViewModel(private val repository: EmployeeRepository) : ViewModel() {
    val allEmployees: LiveData<List<Employee>> = repository.allEmployees.asLiveData()

    fun insert(employee: Employee) = viewModelScope.launch {
        repository.insert(employee)
    }
}

class WordViewModelFactory(private val repository: EmployeeRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(EmployeeViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return EmployeeViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
