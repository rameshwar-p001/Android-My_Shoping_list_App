//package com.example.my_shoping_listday_7
//
//import retrofit2.Retrofit
//import retrofit2.converter.gson.GsonConverterFactory
//import retrofit2.create
//
//object RetrofitClient {
//    private const val  BASE_URL = "https://maps.googleapis.com/"
//
//    fun create(): GeoCodingApiService{
//        val retrofit =
//            Retrofit.Builder()
//                .baseUrl(BASE_URL)
//                .addConverterFactory(GsonConverterFactory.create())
//                .build()
//
//
//        return retrofit.create(GeoCodingApiService::class.java)
//
//
//    }
//}

package eu.tutorials.myshoppinglistapp

import com.example.my_shoping_listday_7.GeoCodingApiService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitClient {
    private const val BASE_URL = "https://maps.googleapis.com/"

    fun create(): GeoCodingApiService {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return  retrofit.create(GeoCodingApiService::class.java)
    }
}