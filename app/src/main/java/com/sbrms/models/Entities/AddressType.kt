package com.sbrms.models.Entities

import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey

@Entity(tableName = "addressTypes")
class AddressType {
    @PrimaryKey
    var addressTypeID = ""
    var addressTypeDesc: String? = null

    @Ignore
    constructor() {
        addressTypeID = "unknown addressTypeID"
    }

    constructor(addressTypeID: String, addressTypeDesc: String?) {
        if (addressTypeID.isEmpty()) {
            this.addressTypeID = "unknown addressTypeID"
        } else {
            this.addressTypeID = addressTypeID
        }
        this.addressTypeDesc = addressTypeDesc
    }

    override fun toString(): String {
        return "AddressType{" +
                "addressTypeID='" + addressTypeID + '\'' +
                ", addressTypeDesc='" + addressTypeDesc + '\'' +
                '}'
    }
}