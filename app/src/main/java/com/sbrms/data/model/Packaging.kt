package com.sbrms.data.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize


@Entity(tableName = "packaging_table")
@Parcelize
data class Packaging(
    @PrimaryKey(autoGenerate = true)
    val packagingID: Int = 0,
    val abbreviation: String?,
    val description: String?,
    val color: String?,
    val productDimension: String?,
    val qtyPerPackage: Int = 1
) : Parcelable {

}
