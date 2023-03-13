package com.sbrms.ui.registration

import android.hardware.biometrics.BiometricManager
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
    private val _isOwner = MutableLiveData("")
    private val _isAdmin = MutableLiveData("")
    private val _isReceivingStaff = MutableLiveData("")
    private val _isSalesStaff = MutableLiveData("")
    private val _isReturnedStaff = MutableLiveData("")
    private val _isPurchasingStaff = MutableLiveData("")
    private val _isAccountingStaff = MutableLiveData("")

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
     val isOwner: LiveData<String> = _isOwner
    val isAdmin: LiveData<String> = _isAdmin
    val isReceivingStaff: LiveData<String> = _isReceivingStaff
    val isSalesStaff: LiveData<String> = _isSalesStaff
    val isReturnedStaff: LiveData<String> = _isReturnedStaff
    val isPurchasingStaff: LiveData<String> = _isPurchasingStaff
    val isAccountingStaff: LiveData<String> = _isAccountingStaff


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

    fun updateLastName(s: Editable) {
        _lastName.value = s.toString();
    }

    fun updateUserName(s: Editable) {
        _userName.value = s.toString();
    }

    fun updateEmployeeID(s: Editable) {
        _employeeID.value = s.toString();
    }

    fun updatePassword(s: Editable) {
        _password.value = s.toString();
    }

    fun updateEmail(s: Editable) {
        _email.value = s.toString();
    }

    fun updatePhoneNumber(s: Editable) {
        _phoneNumber.value = s.toString();
    }

    fun updateEmployeeAddress(s: Editable) {
        _employeeAddress.value = s.toString();
    }

    fun updatePostalCode(s: Editable) {
        _postalCode.value = s.toString();
    }

    fun updateStartingDate(s: Editable) {
        _startingDate.value = s.toString();
    }

    fun updateIsOwner(s: Editable) {
        _isOwner.value = s.toString().trim()
    }

    fun updateIsAdmin(s: Editable) {
        _isAdmin.value = s.toString().trim()
    }

    fun updateIsReceivingStaff(s: Editable) {
        _isReceivingStaff.value = s.toString().trim()
    }

    fun updateIsSalesStaff(s: Editable) {
        _isSalesStaff.value = s.toString().trim()
    }

    fun updateIsReturnedStaff(s: Editable) {
        _isReturnedStaff.value = s.toString().trim()
    }

    fun updateIsPurchasingStaff(s: Editable) {
        _isPurchasingStaff.value = s.toString().trim()
    }

    fun updateIsAccountingStaff(s: Editable) {
        _isAccountingStaff.value = s.toString().trim()
    }


    fun onRegisterBtnClick() {
       val newEmployee = Employee(
           firstName = _firstName.value,
           lastName = _lastName.value,
           userName = _userName.value,
           employeeID = _employeeID.value,
           password = _password.value,
           email = _email.value,
           phoneNumber = _phoneNumber.value,
           employeeAddress = _employeeAddress.value,
           postalCode = _postalCode.value,
           registrationDate = _registrationDate,
           startingDate = _startingDate.value,
           isOwner = _isOwner.value,
           isAdmin = _isAdmin.value,
           isReceivingStaff = _isReceivingStaff.value,
           isSalesStaff = _isSalesStaff.value,
           isReturnedStaff = _isReturnedStaff.value,
           isPurchasingStaff = _isPurchasingStaff.value,
           isAccountingStaff = _isAccountingStaff.value)

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
