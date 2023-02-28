package com.sbrms.model.entity

import android.os.Parcelable
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

data class Manufacturer(
    val manufacturerID: Int = 0,
    val manufacturerName: String?,
    val manufacturerDescription: String?,
    val contactInfo: String?
)

data class Brand(
    val brandID: Int = 0,
    val brandName: String?,
    val brandCode: String?,
    //@Embedded val manufacturer: Manufacturer
)

data class UnitOfMeasurement(
    val UOMID: Int = 0,
    val UOMAbbreviation: String?,
    val UOMDescription: String
)

data class Packaging(
    val packagingID: Int = 0,
    val packagingAbbreviation: String?,
    val packagingDescription: String?,
    val color: String?,
    val productDimension: String?,
    val qtyPerPackage: Int = 1
)

@Entity(tableName = "product_table")
//@Parcelize
//@Parcelize annotation is commented out because the Brand, which is annotated as @Embedded, is not incompatible with it.
data class Product(
    @PrimaryKey(autoGenerate = true)
    val productID: Int = 0,
    val SKU: String?,
    val UPC: String?,
    val productName: String?,
    val productDescription: String?,
    val productCategoryID: String?,
    val unitPriceID: String?,
    val onHandQty: Int = 0,
    @Embedded val brand: Brand?,
    val model: String?,
    @Embedded val defaultUOM: UnitOfMeasurement?,
    @Embedded val packaging: Packaging?,
    val introductionDate: String?,
    val salesDiscontinuationDate: String?,
    val expirationDate: String?,
    @Embedded val manufacturer: Manufacturer?,
    val supplierID: String?

) {

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




/*Consideration for using @Embedded notation
* 1. Because the relationships between Product and Brand, UOM, Packaging, Manufacturer are one-to-one,
* thus, make Brand, UOM, Packaging, and Manufacturer as embedded data classes.
*
* 2. Since a single product could be offered by multiple suppliers and prices(i.e. MSRP, promotion price, discontinued price etc.),
* thus, treat product to suppliers and prices as one to many relationship.
* The above relationships will be implemented by SQL Queries in their corresponding DAOs via their ID strings.
*
* Reference link: https://developer.android.com/training/data-storage/room/relationships
* */