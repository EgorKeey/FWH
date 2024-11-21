package com.example.fwh

import retrofit2.http.Query
import retrofit2.Call
import retrofit2.http.GET

interface RetrofitAPI {
    @GET("forecast")
    fun getWeather(@Query("latitude")latitude: Double, @Query("longitude")longitude: Double,@Query("current")current:String):Call<Response?>?
}