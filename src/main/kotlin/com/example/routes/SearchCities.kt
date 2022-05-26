package com.example.routes


import com.example.models.City
import com.example.models.CityApiResponse
import com.example.repository.CityRepository
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import org.koin.ktor.ext.inject

fun Route.searchCities() {
    val cityRepository: CityRepository by inject()

    get("/boruto/cities/search") {
        val name = call.request.queryParameters["name"]

        val apiResponse = cityRepository.searchCities(name = name)
        call.respond(
            message = apiResponse,
            status = HttpStatusCode.OK
        )
    }


}