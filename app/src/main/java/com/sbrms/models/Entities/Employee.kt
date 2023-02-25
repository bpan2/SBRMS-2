package com.sbrms.models.Entities

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize
import java.text.DateFormat

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
    val registrationDate: Long = System.currentTimeMillis(),
    val startingDate: String?,
    val userAddress: String?,
    val postalCode: String?,
    val isOwner: Boolean = false,
    val isAdmin: Boolean = false,
    val isSalesStaff: Boolean = false,
    val isReceivingStaff: Boolean = false,
    val isReturnedStaff: Boolean = false,
    val isPurchasingStaff: Boolean = false,
    val isAccountingStaff: Boolean = false,
) : Parcelable {
   val registrationDateFormatted: String
    get() = DateFormat.getDateTimeInstance().format(registrationDate)
}