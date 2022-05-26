package com.example.routes

import com.example.models.ApiResponse
import com.example.models.CityApiResponse
import com.example.repository.CityRepository
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import org.koin.ktor.ext.inject

fun Route.getAllCities(){


    val cityRepository: CityRepository by inject()
    //bu sınıfta repository i inject ediyoruz

    get("/boruto/cities") {
        try {
            val page = call.request.queryParameters["page"]?.toInt() ?: 1 //veri gitmezse önyüze varsayılan sayfa bir olacak
            println("NEW PAGE: $page")              //page parametresi android tarafında yani client tarafında kullanılacak verilerimizi pagination yaparken
            require(page in 1..5)

            val cityApiResponse = cityRepository.getAllCities(page = page) //CityRepositoryImpl sınıfındaki getAllCities fonksiyonunu buraya çağırıyoruz
            call.respond(
                message = cityApiResponse,
                status = HttpStatusCode.OK
            )
        } catch (e: NumberFormatException) { //client sayı yerine text yazarsa hata fırlatsın diye catch yapıyoruz
            call.respond(
                message = CityApiResponse(success = false, message = "Only Numbers Allowed."),
                status = HttpStatusCode.BadRequest
            )
        } catch (e: IllegalArgumentException) {
            //1 ile 5 arasında değilse illegal hatası fırlatır
            call.respond(
                message = CityApiResponse(success = false, message = "Heroes not Found."),
                status = HttpStatusCode.NotFound
            )
        }
    }
}