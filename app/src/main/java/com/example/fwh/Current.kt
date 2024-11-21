package com.example.fwh

data class Current(
    val apparent_temperature: Double,
    val interval: Int,
    val temperature_2m: Double,
    val time: String,
    val weather_Code:Int
)
