package com.sbrms.models.Entities

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize


@Entity(tableName = "supplier_table")
@Parcelize
data class Supplier (
    @PrimaryKey(autoGenerate = true)
    val supplierID: Int = 0,

        )  : Parcelable {
/*    @PrimaryKey
    var supplierID: String = null
    var supplierInventoryID: String? = null
    var companyName: String? = null
    var contactPersonFullName: String? = null
    var companyAddress: String? = null
    var businessAccountNumber: String? = null
    var postalCode: String? = null
    var preferenceType: String? = null
    var ratingType: String? = null

    @Ignore
    internal constructor() {
        supplierID = "Unknown supplier ID"
    }

    internal constructor(supplierID: String, supplierInventoryID: String?, companyName: String?) {
        this.supplierID = supplierID
        this.supplierInventoryID = supplierInventoryID
        this.companyName = companyName
    }

    override fun toString(): String {
        return "Supplier{" +
                "supplierID='" + supplierID + '\'' +
                ", supplierInventoryID='" + supplierInventoryID + '\'' +
                ", companyName='" + companyName + '\'' +
                ", contactPersonFullName='" + contactPersonFullName + '\'' +
                ", companyAddress='" + companyAddress + '\'' +
                ", businessAccountNumber='" + businessAccountNumber + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", preferenceType='" + preferenceType + '\'' +
                ", ratingType='" + ratingType + '\'' +
                '}'
    }*/
}
