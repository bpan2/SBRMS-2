package com.sbrms.models.Entities

import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey

/*
@Entity(tableName = "postalCodes")
class PostalCode {
    @PrimaryKey
    var postalCodeID: String = null
    var firstPortion // Forward Sortation Area
            : String? = null
    var secondPortion // Local Delivery Unit
            : String? = null

    @Ignore
    constructor() {
        postalCodeID = "unknown postalCodeID"
    }

    constructor(postalCodeID: String, firstPortion: String?, secondPortion: String?) {
        if (postalCodeID.isEmpty()) {
            postalCodeID = "unknown postalCodeID"
        } else {
            this.postalCodeID = postalCodeID
        }
        this.firstPortion = firstPortion
        this.secondPortion = secondPortion
    }

    override fun toString(): String {
        return "PostalCode{" +
                "postalCodeID='" + postalCodeID + '\'' +
                ", firstPortion='" + firstPortion + '\'' +
                ", secondPortion='" + secondPortion + '\'' +
                '}'
    }
}*/
