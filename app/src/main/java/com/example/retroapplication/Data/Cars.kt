package com.example.retroapplication.Data

import com.google.gson.annotations.SerializedName

data class Cars(
    val jobNo: Int,
    val truckLicense: String,
    val province: String,
    val truckType: String,
    val routeDt: String,
    val routeCd: String,
    val logisticP: String,
    val arrivalDt: String,
    val departureDt: String
)

/*
val jobNo: Int,
    val truckLicense: String,
    val province: String,
    val truckType: String,
    val routeDt: String,
    val routeCd: String,
    val logisticP: String,
    val arrivalDt: String,
    val departureDt: String

    val jobNo: String,
    val truckLicense: String,
    val province: String,
    val truckType: String,
    val routeDt: String,
    val routeCd: String,
    val logisticP: String,
    val arrivalDt: String,
    @SerializedName("departureDt")
    val DepartDt: String
 */