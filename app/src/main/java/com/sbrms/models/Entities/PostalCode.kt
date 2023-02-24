package com.sbrms.models.Entities;


import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "postalCodes")
public class PostalCode {
    @NonNull
    @PrimaryKey
    private String postalCodeID;
    private String firstPortion; // Forward Sortation Area
    private String secondPortion; // Local Delivery Unit

    @Ignore
    public PostalCode(){
        setPostalCodeID("unknown postalCodeID");
    }

    public PostalCode(String postalCodeID, String firstPortion, String secondPortion){
        if(postalCodeID.isEmpty()){setPostalCodeID("unknown postalCodeID");}
        else{this.postalCodeID = postalCodeID;}

        this.firstPortion = firstPortion;
        this.secondPortion = secondPortion;
    }

    @NonNull
    public String getPostalCodeID() {
        return postalCodeID;
    }

    public void setPostalCodeID(@NonNull String postalCodeID) {
        this.postalCodeID = postalCodeID;
    }

    public String getFirstPortion() {
        return firstPortion;
    }

    public void setFirstPortion(String firstPortion) {
        this.firstPortion = firstPortion;
    }

    public String getSecondPortion() {
        return secondPortion;
    }

    public void setSecondPortion(String secondPortion) {
        this.secondPortion = secondPortion;
    }

    @Override
    public String toString() {
        return "PostalCode{" +
                "postalCodeID='" + postalCodeID + '\'' +
                ", firstPortion='" + firstPortion + '\'' +
                ", secondPortion='" + secondPortion + '\'' +
                '}';
    }
}

