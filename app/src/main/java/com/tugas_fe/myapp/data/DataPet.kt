package com.tugas_fe.myapp.data

import com.tugas_fe.myapp.R
import com.tugas_fe.myapp.model.Pet
import com.tugas_fe.myapp.model.PetFashion

object DataPet {
    val petData = listOf(
        Pet(
            id = 1,
            type = "Cat",
            nickname = "Catty",
            photo = R.drawable.c1,
            age = "3 Bulan",
            detail = "Catty adalah kucing lucu yang sangat suka bermain dengan mainan favoritnya."
        ),
        Pet(
            id = 2,
            type = "Cat",
            nickname = "Patty",
            photo = R.drawable.c2,
            age = "7 Bulan",
            detail = "Patty adalah kucing berwarna belang yang senang berjemur di bawah sinar matahari."
        ),
        Pet(
            id = 3,
            type = "Cat",
            nickname = "Bro",
            photo = R.drawable.c3,
            age = "1 tahun",
            detail = "Bro adalah kucing yang sangat manja dan senang tidur di pangkuan pemiliknya."
        ),
        Pet(
            id = 4,
            type = "Cat",
            nickname = "Bjir",
            photo = R.drawable.c4,
            age = "3 Tahun",
            detail = "Bjir adalah kucing yang suka berpetualang di sekitar rumah dan mencari hal-hal baru."
        ),
        Pet(
            id = 5,
            type = "Cat",
            nickname = "Swallow",
            photo = R.drawable.c5,
            age = "2 Tahun",
            detail = "Swallow adalah kucing yang pemberani dan tidak takut dengan hewan-hewan lain di sekitarnya."
        ),
        Pet(
            id = 6,
            type = "Dog",
            nickname = "Boogy",
            photo = R.drawable.d1,
            age = "1 Tahun",
            detail = "Boogy adalah anjing yang energik dan senang berlari di taman."
        ),
        Pet(
            id = 7,
            type = "Dog",
            nickname = "Jo",
            photo = R.drawable.d2,
            age = "4 Bulan",
            detail = "Jo adalah anjing berjenis ras kecil yang gemar menggonggong pada pengunjung rumah."
        ),
        Pet(
            id = 8,
            type = "Dog",
            nickname = "Pop",
            photo = R.drawable.d3,
            age = "2 tahun",
            detail = "Pop adalah anjing yang setia dan selalu siap menjaga rumah dari ancaman."
        ),
        Pet(
            id = 9,
            type = "Dog",
            nickname = "Kurama",
            photo = R.drawable.d4,
            age = "5 Bulan",
            detail = "Kurama adalah anjing yang cerdas dan cepat belajar trik-trik baru."
        ),
        Pet(
            id = 10,
            type = "Dog",
            nickname = "kucing",
            photo = R.drawable.d5,
            age = "9 Bulan",
            detail = "Kucing (namun sebenarnya anjing) adalah anjing yang sangat ramah dan senang bermain dengan kucing."
        )
    )

    val FashionPet = listOf(
        PetFashion(
            id = 1,
            nickname = "Whiskers",
            photo = R.drawable.f1,
            age = "2 Tahun",
            pemilik = "Alice"
        ),
        PetFashion(
            id = 2,
            nickname = "Mittens",
            photo = R.drawable.f2,
            age = "3 Tahun",
            pemilik = "Bob"
        ),
        PetFashion(
            id = 3,
            nickname = "Socks",
            photo = R.drawable.f3,
            age = "1 Tahun",
            pemilik = "Charlie"
        ),
        PetFashion(
            id = 4,
            nickname = "Boots",
            photo = R.drawable.f4,
            age = "4 Tahun",
            pemilik = "David"
        ),
        PetFashion(
            id = 5,
            nickname = "Tux",
            photo = R.drawable.f5,
            age = "2 Tahun",
            pemilik = "Emma"
        ),
        PetFashion(
            id = 6,
            nickname = "Bella",
            photo = R.drawable.f6,
            age = "3 Tahun",
            pemilik = "Felix"
        ),
        PetFashion(
            id = 7,
            nickname = "Duke",
            photo = R.drawable.f7,
            age = "5 Tahun",
            pemilik = "Grace"
        ),
        PetFashion(
            id = 8,
            nickname = "Princess",
            photo = R.drawable.f8,
            age = "2 Tahun",
            pemilik = "Harry"
        ),
        PetFashion(
            id = 9,
            nickname = "Blue",
            photo = R.drawable.f9,
            age = "4 Tahun",
            pemilik = "Ivy"
        ),
        PetFashion(
            id = 10,
            nickname = "Charlie",
            photo = R.drawable.f10,
            age = "1 Tahun",
            pemilik = "Jack"
        )
    )

}
