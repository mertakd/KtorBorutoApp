package com.example.repository

import com.example.models.ApiResponse
import com.example.models.Hero

const val NEXT_PAGE_KEY = "nextPage"
const val PREVIOUS_PAGE_KEY = "prevPage"

class HeroRepositoryImpl : HeroRepository {

    override val  heroes: Map<Int, List<Hero>> by lazy {
        mapOf(
            1 to page1,  //aşağıdaki listeleri getiriyor sayılar onları temsil ediyor
            2 to page2,
            3 to page3,
            4 to page4,
            5 to page5
        )
    }

    override val page1 = listOf(
        Hero(
            id = 1,
            name = "Sasuke",
            image = "/images/sasuke.jpg",
            about = "Sasuke Uchiha ( うちはサスケUchiha Sasuke ), Konohagakure'nin Uchiha klanının hayatta kalan son üyelerinden biridir. Ağabeyi Itachi, klanlarını katlettikten sonra, Sasuke hayattaki görevini Itachi'yi öldürerek onlardan intikam almayı kendine görev edindi. Ninja olduktan sonra ve rakibi ve en iyi arkadaşı Naruto Uzumaki ile rekabet ederek Takım 7'ye eklenir.",
            rating = 5.0,
            power = 98,
            month = "Temmuz",
            day = "23",
            family = listOf(
                "Fugaku",
                "Mikoto",
                "Itachi",
                "Sarada",
                "Sakura"
            ),
            abilities = listOf(
                "Paylaşımcı",
                "Rinnegan Göz Tekniğ",
                "Sussano",
                "Amateratsu",
                "İstihbarat"
            ),
            natureTypes = listOf(
                "Şimşek",
                "Ateş",
                "Rüzgâr",
                "Toprak",
                "Su"
            )
        ),
        Hero(
            id = 2,
            name = "Naruto",
            image = "/images/naruto.jpg",
            about = "Naruto Uzumaki ( うずまきナルトUzumaki Naruto ), Konohagakure'nin Uzumaki klanından bir şinobidir. Doğduğu gün Dokuz Kuyrukluların jinchūriki'si oldu - bu, çocukluğu boyunca Konoha'nın çoğu tarafından dışlanmasına neden olan bir kader. Kakashi Takımına katıldıktan sonra, Naruto, Hokage olma hayalinin peşinden koşarken, köyün takdirini kazanmak için çok çalıştı..",
            rating = 5.0,
            power = 98,
            month = "Ekim",
            day = "10",
            family = listOf(
                "Minato",
                "Kushina",
                "Boruto",
                "Himawari",
                "Hinata"
            ),
            abilities = listOf(
                "Rasengan",
                "Rasen-Shuriken",
                "Gölge Klonu",
                "Senin Mode"
            ),
            natureTypes = listOf(
                "Rüzgâr",
                "Toprak",
                "Lav",
                "Ateş"
            )
        ),
        Hero(
            id = 3,
            name = "Sakura",
            image = "/images/sakura.jpg",
            about = "Sakura Uchiha (うちはサクラ, Uchiha Sakura, née Haruno (春野)) Konohagakure'nin bir kunoichi'sidir. Takım 7'ye atandığında, Sakura kendini bir shinobi'nin görevleri için hazırlıksız bulur. Ancak, Sannin Tsunade altında eğitimden sonra, bunun üstesinden gelir ve dünyanın en büyük tıbbi-ninlerinden biri olarak kabul edilir.",
            rating = 4.5,
            power = 92,
            month = "Mart",
            day = "28",
            family = listOf(
                "Kizashi",
                "Mebuki",
                "Sarada",
                "Sasuke"
            ),
            abilities = listOf(
                "Çakra Kontrolü",
                "Tıbbi Ninjutsu",
                "Kuvvet",
                "İstihbarat"
            ),
            natureTypes = listOf(
                "Toprak",
                "Su",
                "Ateş"
            )
        )
    )
    override val page2 = listOf(
        Hero(
            id = 4,
            name = "Boruto",
            image = "/images/boruto.png",
            about = "Boruto Uzumaki ( うずまきボルトUzumaki Boruto ), Konohagakure'nin Uzumaki klanından bir shinobi ve annesi aracılığıyla Hyūga klanının doğrudan soyundan. Başlangıçta babasına ve Hokage olduğundan beri yokluğuna kırgın olsa da, Boruto sonunda babasına ve görevlerine saygı duymaya başlar.",
            rating = 4.9,
            power = 95,
            month = "Mart",
            day = "27",
            family = listOf(
                "Naruto",
                "Hinata",
                "Hanabi",
                "Himawari",
                "Kawaki"
            ),
            abilities = listOf(
                "Karma",
                "Zemin",
                "Rasengan Çakra topu",
                "İstihbarat"
            ),
            natureTypes = listOf(
                "Şimşek",
                "Rüzgâr",
                "Su"
            )
        ),
        Hero(
            id = 5,
            name = "Sarada",
            image = "/images/sarada.jpg",
            about = "Sarada Uchiha ( うちはサラダUchiha Sarada ), Konohagakure'nin Uchiha klanından bir kunoichi'dir. Babası yanında olmadan sadece annesi tarafından büyütüldüğü için, Sarada başlangıçta kim olduğunu veya ne olması gerektiğini anlamakta zorlanır. Sarada, Naruto Uzumaki'nin yardımıyla onunla tanıştıktan sonra, başkalarıyla olan bağlantıları tarafından tanımlandığına inanmaya başlar ve Konohamaru Takımı'nın bir üyesi olarak, bir gün Hokage olmak ister, böylece olabildiğince çok insanla bağlantı kurabilir. mümkün.",
            rating = 4.9,
            power = 95,
            month = "Mart",
            day = "31",
            family = listOf(
                "Sasuke Uchiha",
                "Sakura Uchiha"
            ),
            abilities = listOf(
                "Paylaşımcı",
                "Kuvvet",
                "İstihbarat"
            ),
            natureTypes = listOf(
                "Şimşek",
                "Rüzgâr",
                "Ateş"
            )
        ),
        Hero(
            id = 6,
            name = "Mitsuki",
            image = "/images/mitsuki.jpg",
            about = "Mitsuki (ミツキ, Mitsuki), Orochimaru'nun kısmi bir klonu olarak yaratılmış sentetik bir insandır. Boruto Uzumaki'nin \"güneşi\" olup olmadığını doğrulamak için Konohagakure'ye göç ederek shinobi oldu ve Konohamaru Takımı'na alındı. Mitsuki, Orochimaru'nun bir klonu olarak yaratıldı, en az bir eski \"Mitsuki\" ile aynı embriyodan yetiştirildi ve bir test tüpünde büyütüldü.",
            rating = 4.9,
            power = 95,
            month = "Temmuz",
            day = "25",
            family = listOf(
                "Orochimaru",
                "Log"
            ),
            abilities = listOf(
                "Senin Modu",
                "Dönüşüm",
                "İstihbarat"
            ),
            natureTypes = listOf(
                "Şimşek",
                "Rüzgâr"
            )
        )
    )
    override val page3 = listOf(
        Hero(
            id = 7,
            name = "Kawaki",
            image = "/images/kawaki.jpg",
            about = "Kawaki ( カワキKawaki ), Kara tarafından Isshiki Ōtsutsuki'nin gelecekteki gemisi ve en büyük dileklerini gerçekleştirmenin anahtarı olması için yetiştirilen bir çocuktur.[1] Takım 7 tarafından Konohagakure'ye getirildikten sonra, Naruto Uzumaki tarafından alınır ve Naruto Uzumaki onu kendi gibi yetiştirir ve bu sırada Boruto Uzumaki ile Kāma'nın gizemini çözmek için kardeşçe bir bağ geliştirir.",
            rating = 4.2,
            power = 92,
            month = "Ocak",
            day = "1",
            family = listOf(
                "Kokatsu"
            ),
            abilities = listOf(
                "Karma",
                "Dönüşüm",
                "Kuvvet"
            ),
            natureTypes = listOf(
                "Ateş"
            )
        ),
        Hero(
            id = 8,
            name = "Orochimaru",
            image = "/images/orochimaru.jpg",
            about = "Orochimaru (大蛇丸, Orochimaru), Konohagakure'nin efsanevi Sanninlerinden biridir. Orochimaru, dünyanın tüm sırlarını öğrenmek için bir yaşam hırsı ile ölümsüzlüğü arar, böylece görevini yerine getirmek için gerekli tüm yaşamları yaşayabilir. Bu ölümsüzlük uğruna hemşehrileri üzerinde etik olmayan deneyler yaparken suçüstü yakalanan Orochimaru, Konoha'dan kaçtı.",
            rating = 4.5,
            power = 97,
            month = "Ekim",
            day = "27",
            family = listOf(
                "Mitsuki",
                "Log"
            ),
            abilities = listOf(
                "Senin Mode",
                "Dönüşüm",
                "Bilim"
            ),
            natureTypes = listOf(
                "Şimşek",
                "Rüzgâr",
                "Ateş",
                "Toprak",
                "Su"
            )
        ),
        Hero(
            id = 9,
            name = "Kakashi",
            image = "/images/kakashi.png",
            about = "Kakashi Hatake (はたけカカシ, Hatake Kakashi), Konohagakure'nin Hatake klanından bir şinobidir. Sharingan'ın Kakashi'si (写輪眼のカカシ, Sharingan no Kakashi), Konoha'nın en yetenekli ninjalarından biridir ve kişisel sorumluluktan hoşlanmamasına rağmen düzenli olarak tavsiye ve liderlik için aranır. Kakashi, Team 7'deki öğrencilerine ekip çalışmasının önemini vurguluyor; kendisi bu dersi Sharingan ile birlikte çocukluk arkadaşı Obito Uchiha'dan aldı.",
            rating = 4.5,
            power = 96,
            month = "Eylül",
            day = "15",
            family = listOf(
                "Sakumo"
            ),
            abilities = listOf(
                "İstihbarat",
                "Kuvvet"
            ),
            natureTypes = listOf(
                "Şimşek",
                "Rüzgâr",
                "Ateş",
                "Toprak",
                "Su"
            )
        )
    )
    override val page4 = listOf(
        Hero(
            id = 10,
            name = "Isshiki",
            image = "/images/ishiki.jpg",
            about = "Bin yıl önce, Isshiki, Çakra Meyvesini hasat etmek için bir Ağaç dikmek amacıyla Kaguya ile birlikte Dünya'ya geldi. Alt sıradaki Kaguya'nın Çakra Meyvesi yaratmak için feda edilmesi planlanırken, bunun yerine Isshiki'yi açtı ve Isshiki'nin alt yarısını yok ettikten sonra onu ölümün eşiğinde bıraktı. Jigen ile karşılaşan ve ona bir Kāma yerleştirecek gücü olmayan Isshiki, umutsuz bir plan yaptı ve Jigen'in besinlerini emerek yarasından kurtulmak için keşişin kulağına girmek için kendini küçülttü.",
            rating = 5.0,
            power = 100,
            month = "Ocak",
            day = "1",
            family = listOf(
                "Otsutsuki Clan"
            ),
            abilities = listOf(
                "Sukunahikona",
                "Daikokuten",
                "Byakugan 360 Derece Görüş",
                "Uzay Zaman Kapısı",
                "İstihbarat"
            ),
            natureTypes = listOf(
                "Ateş"
            )
        ),
        Hero(
            id = 11,
            name = "Momoshiki",
            image = "/images/momoshiki.jpg",
            about = "Momoshiki Ōtsutsuki (大筒木モモシキ, Ōtsutsuki Momoshiki), Ōtsutsuki klanının ana ailesinin bir üyesiydi, Kaguya'nın ve onun Tanrı Ağacı'nın nerede olduğunu araştırmak için gönderildi ve ardından Yedinci Hokage çakrasından yeni bir tane yetiştirmeye çalıştı. Boruto Uzumaki tarafından öldürülme sürecinde, Momoshiki ona bir Kāma yerleştirdi ve ruhunun işaret boyunca sağlam kalmasına izin verdi.",
            rating = 3.9,
            power = 98,
            month = "Ocak",
            day = "1",
            family = listOf(
                "Otsutsuki Clan"
            ),
            abilities = listOf(
                "Rinnegan Ruh Göçü Gözü",
                "Byakugan 360 Derece Görüş",
                "Kuvvet"
            ),
            natureTypes = listOf(
                "Ateş",
                "Şimşek",
                "Rüzgâr",
                "Su",
                "Toprak"
            )
        ),
        Hero(
            id = 12,
            name = "Urashiki",
            image = "/images/urashiki.jpg",
            about = "Urashiki Ōtsutsuki ( 大筒木ウラシキtsutsuki Urashiki ), Ōtsutsuki klanının ana ailesinin düşük rütbeli bir üyesiydi, Momoshiki ve Kinshiki'ye Kaguya'nın nerede olduğunu araştırmak ve Dünyadaki Tanrı Ağacının çakrasını toplamak görevlerinde yardımcı olmak için gönderildi. Yoldaşlarıyla karşılaştırıldığında, Urashiki'nin oldukça rahat ve neşeli bir kişiliğe sahip olduğu gösterilmişti. Momoshiki ve Kinshiki ile birlikte şaka yapmaya oldukça istekliydi ve ne kadar ciddi olduklarını küçümsedi.",
            rating = 3.4,
            power = 95,
            month = "Ocak",
            day = "1",
            family = listOf(
                "Otsutsuki Clan"
            ),
            abilities = listOf(
                "Uzay Zaman Kapısı",
                "Rinnegan Ruh Göçü Gözü",
                "Byakugan 360 Derece Görüş"
            ),
            natureTypes = listOf(
                "Ateş",
                "Şimşek",
                "Rüzgar",
                "Toprak"
            )
        )
    )
    override val page5 = listOf(
        Hero(
            id = 13,
            name = "Code",
            image = "/images/code.jpg",
            about = "Kod ( コードKōdo ), Kara'dan son aktif İç'tir. Isshiki Ōtsutsuki'nin mirasını içinde taşıyarak, Ōtsutsuki Klanının Göksel Varlık olma ve sürekli gelişme iradesini miras alır. Kawaki Kara'ya getirildiğinde, Code, Isshiki için bir Kāma gemisi aramak için Jigen ve Amado'nun Ōtsutsuki ritüelindeki on beş adaydan biriydi. Sadece Kawaki gerçek bir gemi olmak için hayatta kaldı.",
            rating = 4.8,
            power = 99,
            month = "Ocak",
            day = "1",
            family = listOf(
                "Unknown"
            ),
            abilities = listOf(
                "Beyaz Karma",
                "Dönüşüm",
                "Genjutsu"
            ),
            natureTypes = listOf(
                "Bilinmiyor"
            )
        ),
        Hero(
            id = 14,
            name = "Amado",
            image = "/images/amado.jpg",
            about = "Amado ( アマドAmado ), Kara organizasyonundan eski bir Inner ve araştırma ve geliştirme bölümünün başıdır. O zamandan beri, Hokage'nin korunması için resmi vatandaşlık kazanmak için blöf ve hediyelerin bir karışımını kullandığı Konohagakure'ye sığındı. Amado'nun Yedinci Hokage saltanatından on iki yıl önce ölen bir kızı vardı. Isshiki Ōtsutsuki'yi öldürme arayışında Amado, Kara'ya katıldı ve araştırma ve geliştirme bölümünün başı olarak hizmet eden İç rütbesi verildi.",
            rating = 5.0,
            power = 90,
            month = "Ocak",
            day = "1",
            family = listOf(
                "Bilinmiyor"
            ),
            abilities = listOf(
                "Bilim",
                "İstihbarat",
                "Hile"
            ),
            natureTypes = listOf(
                "Bilinmiyor"
            )
        ),
        Hero(
            id = 15,
            name = "Koji",
            image = "/images/koji.jpg",
            about = "Koji Kashin (果心居士, Kashin Koji), Amado tarafından Isshiki Ōtsutsuki'yi öldürmek amacıyla yaratılmış bir Jiraiya klonudur. Eski bir Kara İçi, Ateş Ülkesi'nin eteklerinde sektörden sorumluydu. Gizemli bir adam olan Koji, saçma sapan bir görüş izleyen çok sabırlı ve basit bir doğaya sahiptir. Kibirli görünse de, kendini sürekli olarak çok mantıklı ve anlayışlı bir adam olarak göstermiştir.",
            rating = 4.5,
            power = 90,
            month = "Ocak",
            day = "1",
            family = listOf(
                "Jiraiya"
            ),
            abilities = listOf(
                "Senin Mode",
                "Rasengan Girdabı",
                "Gölge Klonu"
            ),
            natureTypes = listOf(
                "Ateş",
                "Toprak"
            )
        )
    )

    override suspend fun getAllHeroes(page: Int): ApiResponse {
        return ApiResponse(
            success = true,
            message = "ok",
            prevPage = calculatePage(page = page)[PREVIOUS_PAGE_KEY],
            nextPage = calculatePage(page = page)[NEXT_PAGE_KEY],
            heroes = heroes[page]!!,
            lastUpdated = System.currentTimeMillis()
        )
    }

    private fun calculatePage(page: Int) =
        mapOf(
            PREVIOUS_PAGE_KEY to if(page in 2..5) page.minus(1) else null,
            NEXT_PAGE_KEY to if(page in 1..4) page.plus(1) else null
        )


    override suspend fun searchHeroes(name: String?): ApiResponse {
        return ApiResponse(
            success = true,
            message = "ok",
            heroes = findHeroes(query = name)
        )
    }

    private fun findHeroes(query: String?): List<Hero> {
        val founded = mutableListOf<Hero>()
        return if (!query.isNullOrEmpty()) {
            heroes.forEach { (_, heroes) ->
                heroes.forEach { hero ->
                    if (hero.name.lowercase().contains(query.lowercase())) {
                        founded.add(hero)
                    }
                }
            }
            founded
        } else {
            emptyList()
        }
    }
}