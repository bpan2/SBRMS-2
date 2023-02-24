package com.sbrms.models.Entities;


import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "positionTypes")
public class PositionType {
    @NonNull
    @PrimaryKey
    private String positionTypeID;
    private String title;
    private String positionTypeDesc;
    private int benefitPercentage;
    private String predefinedAuthorizationID;

    @Ignore
    public PositionType(){
        setPositionTypeID("unknown positionTypeID");
    }

    public PositionType(String positionTypeID, String title){
        if(positionTypeID.isEmpty()){setPositionTypeID("unknown positionTypeID");}
        else{this.positionTypeID = positionTypeID;}
        this.title = title;
    }

    @NonNull
    public String getPositionTypeID() {
        return positionTypeID;
    }

    public void setPositionTypeID(@NonNull String positionTypeID) {
        this.positionTypeID = positionTypeID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPositionTypeDesc() {
        return positionTypeDesc;
    }

    public void setPositionTypeDesc(String positionTypeDesc) {
        this.positionTypeDesc = positionTypeDesc;
    }

    public int getBenefitPercentage() {
        return benefitPercentage;
    }

    public void setBenefitPercentage(int benefitPercentage) {
        this.benefitPercentage = benefitPercentage;
    }

    public String getPredefinedAuthorizationID() {
        return predefinedAuthorizationID;
    }

    public void setPredefinedAuthorizationID(String predefinedAuthorizationID) {
        this.predefinedAuthorizationID = predefinedAuthorizationID;
    }

    @Override
    public String toString() {
        return "PositionType{" +
                "positionTypeID='" + positionTypeID + '\'' +
                ", title='" + title + '\'' +
                ", positionTypeDesc='" + positionTypeDesc + '\'' +
                ", benefitPercentage=" + benefitPercentage +
                ", predefinedAuthorizationID='" + predefinedAuthorizationID + '\'' +
                '}';
    }
}
