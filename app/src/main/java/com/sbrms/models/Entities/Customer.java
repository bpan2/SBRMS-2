package com.sbrms.models.Entities;


import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "customers")
public class Customer {
    @NonNull
    @PrimaryKey
    private String customerID;

    Customer(String customerID){this.customerID = customerID;};

    @NonNull
    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(@NonNull String customerID) {
        this.customerID = customerID;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID='" + customerID + '\'' +
                '}';
    }
}
