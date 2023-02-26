package com.sbrms.models.Entities

import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey

/*
@Entity(tableName = "positionTypes")
class PositionType {
    @PrimaryKey
    var positionTypeID: String = null
    var title: String? = null
    var positionTypeDesc: String? = null
    var benefitPercentage = 0
    var predefinedAuthorizationID: String? = null

    @Ignore
    constructor() {
        positionTypeID = "unknown positionTypeID"
    }

    constructor(positionTypeID: String, title: String?) {
        if (positionTypeID.isEmpty()) {
            positionTypeID = "unknown positionTypeID"
        } else {
            this.positionTypeID = positionTypeID
        }
        this.title = title
    }

    override fun toString(): String {
        return "PositionType{" +
                "positionTypeID='" + positionTypeID + '\'' +
                ", title='" + title + '\'' +
                ", positionTypeDesc='" + positionTypeDesc + '\'' +
                ", benefitPercentage=" + benefitPercentage +
                ", predefinedAuthorizationID='" + predefinedAuthorizationID + '\'' +
                '}'
    }
}*/
