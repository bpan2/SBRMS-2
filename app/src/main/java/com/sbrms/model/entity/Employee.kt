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
    val id: Int = 0,
    val employeeID: String?,
    val userName: String?,
    val lastName: String?,
    val firstName: String?,
    val password: String?,
    val phoneNumber: String?,
    val email: String?,
    val registrationDate: String = LocalDate.now().toString(),
    val startingDate: String?,
    val employeeAddress: String?,
    val postalCode: String?,
    val isOwner: String?,
    val isAdmin: String?,
    val isReceivingStaff: String? ,
    val isSalesStaff: String?,
    val isReturnedStaff: String?,
    val isPurchasingStaff: String?,
    val isAccountingStaff: String?
) : Parcelable {
   /*
     //val registrationDate: Long = System.currentTimeMillis(),
   to convert System.currentTimeMillis() into the format like "Nov 11,2020 9:33:38 AM"
   val registrationDateFormatted: String
    get() = DateFormat.getDateTimeInstance().format(registrationDate)
    */
}