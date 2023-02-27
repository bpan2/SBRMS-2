package com.sbrms.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "customers")
class Customer internal constructor(@field:PrimaryKey var customerID: String) {

    override fun toString(): String {
        return "Customer{" +
                "customerID='" + customerID + '\'' +
                '}'
    }
}