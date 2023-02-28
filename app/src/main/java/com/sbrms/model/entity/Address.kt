package com.sbrms.model.entity

import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey

@Entity(tableName = "addresses")
class Address {
    @PrimaryKey
    var addressID = ""
    var apartmentNumber: String? = null
    var streetNumber: String? = null
    var streetName: String? = null
    var city: String? = null
    var county: String? = null
    var state: String? = null
    var province: String? = null
    var country: String? = null
    var addressTypeID: String? = null

    /*@Override
    public String toString() {
        return "Address{" +
                "addressID='" + addressID + '\'' +
                ", apartmentNumber='" + apartmentNumber + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                ", streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                ", county='" + county + '\'' +
                ", state='" + state + '\'' +
                ", province='" + province + '\'' +
                ", country='" + country + '\'' +
                ", addressTypeID='" + addressTypeID + '\'' +
                ", postalCodeID='" + postalCodeID + '\'' +
                '}';
    }*/  var postalCodeID: String? = null

    @Ignore
    constructor() {
        addressID = "unknown addressID"
    }

    constructor(addressID: String, addressTypeID: String?, postalCodeID: String?) {
        if (addressID.isEmpty()) this.addressID = "unknown addressID" else {
            this.addressID = addressID
        }
        this.addressTypeID = addressTypeID
        this.postalCodeID = postalCodeID
    }
}