package com.sbrms.models.Entities

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Entity(tableName = "employee_table")
@Parcelize
data class Employee(
    @PrimaryKey(autoGenerate = true)
    val employeeID: Int = 0,
    val userName: String = "999",
    val lastName: String?,
    val firstName: String?,
    val password: String?,
    val phoneNumber: String?,
    val email: String?,
    val registrationDateID: String?,
    val startingDateID: String?,
    val userAddressID: String?,
    val postalCodeID: String?,
    val isOwner: Boolean = false,
    val isAdmin: Boolean = false,
    val isSalesStaff: Boolean = false,
    val isReceivingStaff: Boolean = false,
    val isReturnedStaff: Boolean = false,
    val isPurchasingStaff: Boolean = false,
    val isAccountingStaff: Boolean = false,
) : Parcelable {
    override fun toString(): String {
        return "Employee{" +
                "employeeID='" + employeeID + '\'' +
                ", userName='" + userName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", registrationDateID='" + registrationDateID + '\'' +
                ", startingDateID='" + startingDateID + '\'' +
                ", userAddressID='" + userAddressID + '\'' +
                ", postalCodeID='" + postalCodeID + '\'' +
                '}'

    }
}