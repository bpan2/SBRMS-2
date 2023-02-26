package com.sbrms.models.Entities

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize


@Entity(tableName = "brand_table")
@Parcelize
data class Brand(
    @PrimaryKey(autoGenerate = true)
    val brandID: Int = 0,
    val brandName: String?,
    val brandCode: String?,
    val manufacturer: Manufacturer
) : Parcelable {

}
