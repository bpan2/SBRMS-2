package com.sbrms.model.entity

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
