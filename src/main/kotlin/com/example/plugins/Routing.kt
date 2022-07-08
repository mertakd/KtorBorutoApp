package com.example.plugins

import com.example.routes.*
import io.ktor.application.*
import io.ktor.http.content.*
import io.ktor.routing.*

fun Application.configureRouting() {
    routing {
        root()
        getAllHeroes()
        searchHeroes()

        static("/images") {
            resources("images")
        }
    }
}

//ENDPOİNTLERİ BURAYA YAZIYORUZ.

/*
* Gelen istekler sonra routing e yönelinir, sonra plugin sonra handler a.
* handler isteği işler daha sonra yine plugin den geçer
* en son cevap response client a iletilir
 */