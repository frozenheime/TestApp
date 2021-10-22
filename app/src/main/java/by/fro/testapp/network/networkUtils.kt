package by.fro.testapp.network

import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

const val baseUrl = "https://jsonplaceholder.typicode.com/"

val service = Retrofit.Builder()
    .baseUrl(baseUrl)
    .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
    .addConverterFactory(GsonConverterFactory.create())
    .build()
    .create(Api::class.java)