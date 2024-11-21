package com.example.fwh


import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Retrofit

class ApiConfig {
    companion object{
        fun getApiService():
                RetrofitAPI{
            val retrofit = Retrofit.Builder().baseUrl("https://api.open-meteo.com/v1/").addConverterFactory(GsonConverterFactory.create()).build()
            return retrofit.create(RetrofitAPI::class.java)
        }
    }
}