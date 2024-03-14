package com.example.myapplication

import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Retrofit



class Retrofit {

    val retrofit = Retrofit.Builder()
        .baseUrl("https://e19a47a5-91ba-4e68-9085-8dbf624cd7e8-00-1wr84z28oyvko.spock.replit.dev/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val apiService = retrofit.create(ApiService::class.java)

}