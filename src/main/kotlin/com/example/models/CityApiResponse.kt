package com.example.models

import kotlinx.serialization.Serializable

@Serializable
data class CityApiResponse(
    val success: Boolean,
    val message: String? = null,
    val prevPage: Int? = null,
    val nextPage: Int? = null,
    val cities: List<City> = emptyList(),
    val lastUpdated: Long? = null
)