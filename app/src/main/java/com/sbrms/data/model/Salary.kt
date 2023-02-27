package com.sbrms.data.model

import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey

/*
@Entity(tableName = "salaries")
class Salary {
    @PrimaryKey
    var salaryID: String = null
    var biWeeklyAmount = 0.0
    var salaryDesc: String? = null

    @Ignore
    constructor() {
        salaryID = "unknown salaryID"
    }

    constructor(salaryID: String, biWeeklyAmount: Double) {
        if (salaryID.isEmpty()) {
            salaryID = "unknown salaryID"
        } else {
            this.salaryID = salaryID
        }
        this.biWeeklyAmount = biWeeklyAmount
    }

    override fun toString(): String {
        return "Salary{" +
                "salaryID='" + salaryID + '\'' +
                ", biWeeklyAmount=" + biWeeklyAmount +
                ", salaryDesc='" + salaryDesc + '\'' +
                '}'
    }
}*/
