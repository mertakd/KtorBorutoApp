package com.example

import io.ktor.application.*
import com.example.plugins.*

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused")
fun Application.module() {
    configureKoin()
    configureRouting()
    configureSerialization()
    configureMonitoring()
    configureDefaultHeader()
    configureStatusPages()
}

/*
        MODUL
    *temel olarak, modüllerin sunucu uygulamamızdaki mantığı ayırmak için kullanıldığı anlamına gelir;
    sonuçta daha temiz bir proje yapısına sahip olmamızı sağlar.
 */

/*
* Gelen istekler sonra routing e yönelinir, sonra plugin sonra handler a.
* Rooting, bir sunucu uygulamasında gelen istekleri işlemek için temel Ktor eklentisidir.
* handler isteği işler daha sonra yine plugin den geçer
* en son cevap response client a iletilir
* Routing extension fonksiyon Apllication fonksiyonunun
 */

/*
            PAGINATION

      Yani müşterilerimize bir yanıt gönderirken tüm kahramanlarımızı göndermeyeceğiz.
Bunun yerine bir kerede onlara birden fazla sayfa gönderebilmek istiyoruz ve her sayfanın içini
cevabımızda.
       *Bu kahramanları sunucudan sırayla, sayfa sayfa ve çünkü
15 kahramanımız olacak, beş farklı sayfa oluşturacağım ve her sayfada
üç kahramanımız.
 */