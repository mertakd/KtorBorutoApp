package com.example.repository

import com.example.models.City
import com.example.models.CityApiResponse

const val CITY_NEXT_PAGE_KEY = "nextPage"
const val CITY_PREVIOUS_PAGE_KEY = "prevPage"

class CityRepositoryImpl : CityRepository{

    override val cities: Map<Int, List<City>> by lazy {
        mapOf(
            1 to page1,  //aşağıdaki listeleri getiriyor sayılar onları temsil ediyor
            2 to page2,
            3 to page3,
            4 to page4,
            5 to page5
        )
    }


    override val page1 = listOf(
        City(
            id = 1,
            cityName = "İstanbul",
            cityDescription = "Güzel şehir İstanbul pampa",
            cityImages =  "/images/istanbul.jpg"

        ),
        City(
            id = 2,
            cityName = "Adalar",
            cityDescription = "Adalar, İstanbul'un Büyükada, Heybeliada, Burgazada, Kınalıada, Sedefadası, Sivriada, Yassıada, Kaşık Adası ve Tavşan Adası adlı 9 adadan oluşan ilçesidir. Adalar'a ilk vapur seferleri Galata Köprüsü'nden 1846 yılında başlamıştır. Bugün Kabataş, Kadıköy ve Bostancı'dan sürekli deniz yolu bağlantısı vardır",
            cityImages =  "/images/buyukada.jpg"


        ),
        City(
            id = 3,
            cityName = "Poyrazkoy",
            cityDescription = "Kuruluş tarihi altı yüzyıl öncesine kadar giden Poyrazköy’e ilk yerleşenlerin Cenevizlilerin olduğu tahmin edilmektedir. Köye daha sonra Bizanslılar gelip yerleşmiş ancak köyün Osmanlı hâkimiyetine geçmesinin ardından Trabzon ve Rize’den getirtilen insanlarla birlikte çehresi değişmiştir.",
            cityImages =  "/images/poyrazkoy.jpg"

        )
    )
    override val page2 = listOf(
        City(
            id = 4,
            cityName = "Anadolukavagı",
            cityDescription = "İstanbul Boğazının Karadeniz den giriş kapısı konumundaki Anadolu Kavağı yıllardır değişmeyen görüntüsü ile nostaljik balıkçı köyü özelliğini koruyor.",
            cityImages =  "/images/anadolukavagi.jpg"

        ),
        City(
            id = 5,
            cityName = "Cumalıkızık",
            cityDescription = "Kuruluşu yaklaşık 1300'lü yıllara denk gelmektedir. Bir vakıf köyü olarak kurulan köyde, tarihi doku çok iyi korunmuştur ve Osmanlı erken döneminin kırsal kesim sivil mimari örnekleri günümüze ulaşmayı başarmıştır. Bu özelliği nedeniyle çok ilgi çeken ve ziyaret edilen bir yerleşim yeri olmuştur. Sık sık tarihsel filmlere mekan olmaktadır.",
            cityImages =  "/images/cumalikizik.jpg"

        ),
        City(
            id = 6,
            cityName = " Uludağ",
            cityDescription = "Türkiye'nin en büyük kış ve doğa sporları merkezi olan Uludağ; Marmara Bölgesinin en yüksek dağıdır. Açık havada İstanbul, Marmara denizi ve civar yakın yerlerin görünmesi buraya ayrı bir özellik vermektedir.",
            cityImages =  "/images/uludag.jpg"

        )
    )
    override val page3 = listOf(
        City(
            id = 7,
            cityName = "İstanbul",
            cityDescription = "Güzel şehir pampa",
            cityImages =  "/images/naruto.jpg"

        ),
        City(
            id = 8,
            cityName = "İstanbul",
            cityDescription = "Güzel şehir pampa",
            cityImages =  "/images/naruto.jpg"

        ),
        City(
            id = 9,
            cityName = "İstanbul",
            cityDescription = "Güzel şehir pampa",
            cityImages =  "/images/naruto.jpg"

        )
    )
    override val page4 = listOf(
        City(
            id = 10,
            cityName = "İstanbul",
            cityDescription = "Güzel şehir pampa",
            cityImages =  "/images/naruto.jpg"

        ),
        City(
            id = 11,
            cityName = "İstanbul",
            cityDescription = "Güzel şehir pampa",
            cityImages =  "/images/naruto.jpg"

        ),
        City(
            id = 12,
            cityName = "İstanbul",
            cityDescription = "Güzel şehir pampa",
            cityImages =  "/images/naruto.jpg"

        )
    )
    override val page5 = listOf(
        City(
            id = 13,
            cityName = "İstanbul",
            cityDescription = "Güzel şehir pampa",
            cityImages =  "/images/naruto.jpg"

        ),
        City(
            id = 14,
            cityName = "İstanbul",
            cityDescription = "Güzel şehir pampa",
            cityImages =  "/images/naruto.jpg"

        ),
        City(
            id = 15,
            cityName = "İstanbul",
            cityDescription = "Güzel şehir pampa",
            cityImages =  "/images/naruto.jpg"

        )
    )

    override suspend fun getAllCities(page: Int): CityApiResponse {
        return CityApiResponse(
            success = true,
            message = "ok",
            prevPage = cityCalculatePage(page = page)[CITY_PREVIOUS_PAGE_KEY] ,
            nextPage = cityCalculatePage(page = page)[CITY_NEXT_PAGE_KEY] ,
            cities = cities[page]!!
        )
    }

    private fun cityCalculatePage(page: Int) =
        mapOf(
            CITY_PREVIOUS_PAGE_KEY to if(page in 2..5) page.minus(1) else null,
            CITY_NEXT_PAGE_KEY to if(page in 1..4) page.plus(1) else null
        )

    override suspend fun searchCities(name: String?): CityApiResponse {
        return CityApiResponse(
            success = true,
            message = "ok",
            cities = findCities(query = name)
        )
    }

    private fun findCities(query: String?): List<City> {
        val founded = mutableListOf<City>()
        return if (!query.isNullOrEmpty()) {
            cities.forEach { (_, cities) ->
                cities.forEach { cities ->
                    if (cities.cityName.lowercase().contains(query.lowercase())) {
                        founded.add(cities)
                    }
                }
            }
            founded
        } else {
            emptyList()
        }
    }


    /*
        *bu sınıfta pagination işlemini yaptık
        *verileri listelere yerleştirdik
        * burdaki fonksiyonları routes deki sınıflara çağıracaz mesela burdaki getAllCities fonksiyonunu AllCities e gönderecez.
     */

}