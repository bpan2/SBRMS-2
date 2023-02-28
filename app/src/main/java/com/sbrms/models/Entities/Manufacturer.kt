package com.sbrms.models.Entities

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity(tableName = "manufacturer_table")
@Parcelize
data class Manufacturer(
    @PrimaryKey(autoGenerate = true)
    val manufacturerID: Int = 0,
) : Parcelable {

}
