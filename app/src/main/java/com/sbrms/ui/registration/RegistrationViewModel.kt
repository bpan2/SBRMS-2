package com.sbrms.ui.registration

import android.text.Editable
import android.util.Log
import android.widget.Toast
import androidx.databinding.BaseObservable
import androidx.lifecycle.*
import com.sbrms.model.entity.Employee
import com.sbrms.repository.EmployeeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import java.time.LocalDate
import javax.inject.Inject

@HiltViewModel
class RegistrationViewModel @Inject constructor(
    private val repository: EmployeeRepository,
    private val state: SavedStateHandle,
) : ViewModel() {
    public val _firstName = MutableLiveData("")
    private val _lastName = MutableLiveData("")
    private val _userName = MutableLiveData("")
    private val _employeeID = MutableLiveData("")
    private val _password = MutableLiveData("")
    private val _email = MutableLiveData("")
    private val _phoneNumber = MutableLiveData("")
    private val _employeeAddress = MutableLiveData("")
    private val _postalCode = MutableLiveData("")
    private val _registrationDate: String = LocalDate.now().toString()
    private val _startingDate = MutableLiveData("")
    private val _isOwner = MutableLiveData(false)
    private val _isAdmin = MutableLiveData(false)
    private val _isReceivingStaff = MutableLiveData(false)
    private val _isSalesStaff = MutableLiveData(false)
    private val _isReturnedStaff = MutableLiveData(false)
    private val _isPurchasingStaff = MutableLiveData(false)
    private val _isAccountingStaff = MutableLiveData(false)

    val firstName: LiveData<String> = _firstName
    val lastName: LiveData<String> = _lastName
    val userName: LiveData<String> = _userName
    val employeeID: LiveData<String> = _employeeID
    val password: LiveData<String> = _password
    val email: LiveData<String> = _email
    val phoneNumber: LiveData<String> = _phoneNumber
    val employeeAddress: LiveData<String> = _employeeAddress
    val postalCode : LiveData<String> = _postalCode
    val registrationDate: String = _registrationDate
    val startingDate: LiveData<String> = _startingDate
    val isOwner: LiveData<Boolean> = _isOwner
    val isAdmin: LiveData<Boolean> = _isAdmin
    val isReceivingStaff: LiveData<Boolean> = _isReceivingStaff
    val isSalesStaff: LiveData<Boolean> = _isSalesStaff
    val isReturnedStaff: LiveData<Boolean> = _isReturnedStaff
    val isPurchasingStaff: LiveData<Boolean> = _isPurchasingStaff
    val isAccountingStaff: LiveData<Boolean> = _isAccountingStaff

    //https://stackoverflow.com/questions/70579144/the-expression-cannot-be-inverted-to-be-used-in-a-two-way-binding-in-edittext-e
    /* The only Unfortunately temp solution for the issue that the MutableLiveData variables can't get the values entered via the UI
    2nd approach :
        If you want to use LiveData then use afterTextChanged to set the value :
            in ViewModel :
                fun updateClientUrl(s: Editable) {
                    _clientUrl.value = s.toString();
                }

            in XML :
                android:text="@{viewmodel.clientUrl}"
                android:afterTextChanged="@{viewmodel.updateClientUrl}"
    */
    fun updateFirstName(s: Editable) {
        _firstName.value = s.toString();
    }


    fun onRegisterBtnClick() {

       val newEmployee = Employee(
           firstName = _firstName.value,
           lastName = lastName.value.toString(),
           userName = userName.value,
           employeeID = employeeID.value,
           password = password.value,
           email = email.value,
           phoneNumber = phoneNumber.value,
           employeeAddress = employeeAddress.value,
           postalCode = postalCode.value,
           registrationDate = registrationDate,
           startingDate = startingDate.value,
           isOwner = isOwner.value,
           isAdmin = isAdmin.value,
           isReceivingStaff = isReceivingStaff.value,
           isReturnedStaff = isReturnedStaff.value,
           isPurchasingStaff = isPurchasingStaff.value,
           isAccountingStaff = isAccountingStaff.value)

        createEmployee(newEmployee)
    }

    private fun createEmployee(employee: Employee) = viewModelScope.launch {
        repository.insert(employee)
    }
}

/*
class RegistrationViewModelFactory(private val repository: EmployeeRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(RegistrationViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return RegistrationViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }

}
*/


/* Notes & Backup code:
 val allEmployees: LiveData<List<Employee>> = repository.allEmployees.asLiveData()

 //val currentEmployee = MutableLiveData<Employee>()


 val employee = state.get<Employee>("employee")

    var employeeID = state.get<Int>("employeeID") ?: employee?.employeeID ?: 999
        set(value) {
            field = value
            state["employeeID"] = value
        }

    var userName = state.get<String>("userName") ?: employee?.userName ?: ""
        set(value) {
            field = value
            state["userName"] = value
        }


    var email = state.get<String>("email") ?: employee?.email ?: ""
        set(value) {
            field = value
            state["email"] = value
        }


    var password = state.get<String>("password") ?: employee?.password ?: ""
        set(value) {
            field = value
            state["password"] = value
        }


    var taskImportance = state.get<Boolean>("taskImportance") ?: task?.important ?: false
         set(value) {
             field = value
             state.set("taskImportance", value)
         }
*/
