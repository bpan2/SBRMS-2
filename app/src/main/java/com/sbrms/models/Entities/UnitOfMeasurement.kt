package com.sbrms.models.Entities

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize


@Entity(tableName = "unitofmeasurement_table")
@Parcelize
data class UnitOfMeasurement(
    @PrimaryKey(autoGenerate = true)
    val UOMID: Int = 0,
    val abbreviation: String?,
    val description: String
) : Parcelable {

}
