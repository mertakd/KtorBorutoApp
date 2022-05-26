package com.example.repository

import com.example.models.CityApiResponse
import com.example.models.City

interface CityRepository {

    val cities: Map<Int, List<City>>

    val page1: List<City>
    val page2: List<City>
    val page3: List<City>
    val page4: List<City>
    val page5: List<City>

    suspend fun getAllCities(page: Int = 1): CityApiResponse
    suspend fun searchCities(name: String?): CityApiResponse
}