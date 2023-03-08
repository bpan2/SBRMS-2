package com.sbrms.ui.registration

import androidx.lifecycle.*
import com.sbrms.model.entity.Employee
import com.sbrms.repository.EmployeeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RegistrationViewModel@Inject internal constructor(
    private val repository: EmployeeRepository) : ViewModel() {
    val allEmployees: LiveData<List<Employee>> = repository.allEmployees.asLiveData()

    fun insert(employee: Employee) = viewModelScope.launch {
        repository.insert(employee)
    }
}


class RegistrationViewModelFactory(private val repository: EmployeeRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(RegistrationViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return RegistrationViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}