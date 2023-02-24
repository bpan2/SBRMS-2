package com.sbrms.models.Entities

import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey

/*@Entity(tableName = "product_table")

class Product {
    @PrimaryKey
    var productID: String = null
    var upc: String? = null
    var sku: String? = null
    var price: String? = null
    var onHandQty: String? = null
    var brand: String? = null
    var model: String? = null
    var unitOfMeasurementID: String? = null
    var productCategoryID: String? = null
    var productDesc: String? = null
    var introductionDateID: String? = null
    var salesDiscontinuationDateID: String? = null
    var expirationDateID: String? = null
    var manufacturerID: String? = null
    var supplierID: String? = null

    @Ignore
    constructor() {
        productID = "Unknown product ID"
    }

    constructor(
        productID: String,
        upc: String?,
        sku: String?,
        price: String?,
        onHandQty: String?,
        brand: String?,
        model: String?,
        unitOfMeasurementID: String?,
        productCategoryID: String?,
        productDesc: String?,
        introductionDateID: String?,
        salesDiscontinuationDateID: String?,
        expirationDateID: String?,
        manufacturerID: String?,
        supplierID: String?
    ) {
        if (productID.trim { it <= ' ' }.isEmpty()) {
            this.productID = "999999"
        } else {
            this.productID = productID
        }
        this.upc = upc
        this.sku = sku
        this.price = price
        this.onHandQty = onHandQty
        this.brand = brand
        this.model = model
        this.unitOfMeasurementID = unitOfMeasurementID
        this.productCategoryID = productCategoryID
        this.productDesc = productDesc
        this.introductionDateID = introductionDateID
        this.salesDiscontinuationDateID = salesDiscontinuationDateID
        this.expirationDateID = expirationDateID
        this.manufacturerID = manufacturerID
        this.supplierID = supplierID
    }

    override fun toString(): String {
        return "Product{" +
                "productID='" + productID + '\'' +
                ", upc='" + upc + '\'' +
                ", sku='" + sku + '\'' +
                ", price='" + price + '\'' +
                ", onHandQty='" + onHandQty + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", unitOfMeasurementID='" + unitOfMeasurementID + '\'' +
                ", productCategoryID='" + productCategoryID + '\'' +
                ", productDesc='" + productDesc + '\'' +
                ", introductionDateID='" + introductionDateID + '\'' +
                ", salesDiscontinuationDateID='" + salesDiscontinuationDateID + '\'' +
                ", expirationDateID='" + expirationDateID + '\'' +
                ", manufacturerID='" + manufacturerID + '\'' +
                ", supplierID='" + supplierID + '\'' +
                '}'
    }
}*/
