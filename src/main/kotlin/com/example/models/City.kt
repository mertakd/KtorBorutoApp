package com.example.models

import kotlinx.serialization.Serializable

@Serializable
data class City(
    val id : Int,
    val cityName : String,
    val cityDescription : String,
    val cityImages : String
)
