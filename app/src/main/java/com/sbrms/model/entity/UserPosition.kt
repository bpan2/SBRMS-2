package com.sbrms.model.entity

/*
@Entity(foreignKeys = [ForeignKey(entity = Employee::class,
    parentColumns = "employeeID",
    childColumns = "userID"), ForeignKey(entity = Position::class,
    parentColumns = "positionID",
    childColumns = "positionID")], tableName = "userpositions")
class UserPosition {
    @PrimaryKey
    var userPositionID: String = null
    var userID: String? = null
    var positionID: String? = null

    @Ignore
    constructor() {
        userPositionID = "unknown userPositionID"
    }

    constructor(userPositionID: String) {
        if (userPositionID.isEmpty()) {
            userPositionID = "unknown userPositionID"
        } else {
            this.userPositionID = userPositionID
        }
    }

    override fun toString(): String {
        return "UserPosition{" +
                "userPositionID='" + userPositionID + '\'' +
                ", userID='" + userID + '\'' +
                ", positionID='" + positionID + '\'' +
                '}'
    }
}*/
