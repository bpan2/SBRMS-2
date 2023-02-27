package com.sbrms.data.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize


@Entity(tableName = "price_table")
@Parcelize
data class Price(
    @PrimaryKey(autoGenerate = true)
    val priceID: Int = 0,
    val priceComponentID: String?,
    val fromDate: String?,
    val thruDate: String?,
    val percentage: Float = 0F,
    val comment: String?,
    val msrp: Float = 0F,
    val basePrice: Float = 0F,
    val oneTimeCharge: Float = 0F,
    val utilizationCharge: Float = 0F,
    val surchargeComponent: Float = 0F,
    val discountComponent: Float = 0F,
    val promotionComponent: Float = 0F
    ) : Parcelable {

}
