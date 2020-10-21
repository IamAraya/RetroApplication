package com.example.retroapplication.Data

import android.telecom.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

val BASE_URL = "https://dev.priorsolution.co.th/"
interface ApiService {
    @GET("test/job_list.json")
    fun getCars(): retrofit2.Call<List<Cars>>

    companion object{
        operator  fun invoke(): ApiService {
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ApiService::class.java)

        }
    }
}