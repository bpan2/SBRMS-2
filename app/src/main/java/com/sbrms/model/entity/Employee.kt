package com.sbrms.model.entity

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

import java.time.LocalDate

@Entity(tableName = "employee_table")
@Parcelize
data class Employee(
    @PrimaryKey(autoGenerate = true)
    val employeeID: Int,
    val userName: String,
    val lastName: String?,
    val firstName: String?,
    val password: String?,
    val phoneNumber: String?,
    val email: String?,
    //val registrationDate: Long = System.currentTimeMillis(),
    val registrationDate: String = LocalDate.now().toString(),
    val startingDate: String?,
    val employeeAddress: String?,
    val postalCode: String?,
    val isOwner: Boolean = false,
    val isAdmin: Boolean = false,
    val isReceivingStaff: Boolean = false,
    val isSalesStaff: Boolean = false,
    val isReturnedStaff: Boolean = false,
    val isPurchasingStaff: Boolean = false,
    val isAccountingStaff: Boolean = false,
) : Parcelable {
   /* to convert System.currentTimeMillis() into the format like "Nov 11,2020 9:33:38 AM"
   val registrationDateFormatted: String
    get() = DateFormat.getDateTimeInstance().format(registrationDate)
    */
}