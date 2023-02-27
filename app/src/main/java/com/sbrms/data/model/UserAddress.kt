package com.sbrms.data.model

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Ignore
import androidx.room.PrimaryKey
/*

@Entity(foreignKeys = [ForeignKey(entity = Employee::class,
    parentColumns = "employeeID",
    childColumns = "userID"), ForeignKey(entity = Address::class,
    parentColumns = "addressID",
    childColumns = "addressID")], tableName = "useraddresses")
class UserAddress {
    @PrimaryKey
    var userAddressID: String = null
    var userID: String? = null
    var addressID: String? = null

    @Ignore
    constructor() {
        userAddressID = "unknown UserAddressID"
    }

    constructor(userAddressID: String) {
        if (userAddressID.isEmpty()) {
            userAddressID = "unknown UserAddressID"
        } else {
            this.userAddressID = userAddressID
        }
    }

    override fun toString(): String {
        return "UserAddress{" +
                "userAddressID='" + userAddressID + '\'' +
                ", userID='" + userID + '\'' +
                ", addressID='" + addressID + '\'' +
                '}'
    }
}*/
