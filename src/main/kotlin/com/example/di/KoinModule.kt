package com.example.di

import com.example.repository.CityRepository
import com.example.repository.CityRepositoryImpl
import com.example.repository.HeroRepository
import com.example.repository.HeroRepositoryImpl
import org.koin.dsl.module

val koinModule = module {
    single<HeroRepository> {
        HeroRepositoryImpl()
    }

    single<CityRepository> {
        CityRepositoryImpl()
    }


    /*
    -singleton oluşturuyoruz
    -HerorepositoryImp sınıfının instance sini oluşturuyoruz.bu instance ın singleton olmalı
     */
}