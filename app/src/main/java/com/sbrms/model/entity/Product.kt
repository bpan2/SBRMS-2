package com.sbrms.model.entity

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize


@Entity(tableName = "product_table")
@Parcelize
data class Product(
    @PrimaryKey(autoGenerate = true)
    val productID: Int = 0,
    val SKU: String?,
    val UPC: String?,
    val productName: String?,
    val productDescription: String?,
    val productCategoryID: String?,
    val unitPrice: Price?,
    val onHandQty: Int = 0,
    val brand: Brand?,
    val model: String?,
    val defaultUnitOfMeasurementID: UnitOfMeasurement?,
    val packaging: Packaging,
    val introductionDate: String?,
    val salesDiscontinuationDate: String?,
    val expirationDate: String?,
    val manufacturer: Manufacturer?,
    val supplier: Supplier?

) : Parcelable{

    /*override fun toString(): String {
        return "Product{" +
                "productID='" + productID + '\'' +
                ", upc='" + upc + '\'' +
                ", sku='" + sku + '\'' +
                ", price='" + price + '\'' +
                ", onHandQty='" + onHandQty + '\'' +
                ", brand='" + brand + '\'' +
                ", entities='" + entities + '\'' +
                ", unitOfMeasurementID='" + unitOfMeasurementID + '\'' +
                ", productCategoryID='" + productCategoryID + '\'' +
                ", productDesc='" + productDesc + '\'' +
                ", introductionDateID='" + introductionDateID + '\'' +
                ", salesDiscontinuationDateID='" + salesDiscontinuationDateID + '\'' +
                ", expirationDateID='" + expirationDateID + '\'' +
                ", manufacturerID='" + manufacturerID + '\'' +
                ", supplierID='" + supplierID + '\'' +
                '}'
    }*/
}
