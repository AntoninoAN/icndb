package com.example.toboc.icnb.model

import com.example.toboc.icnb.R
import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface IcndbService {
    //first button
    @GET("/jokes/random")
    fun getSingleRandomJoke() : Observable<JokesPoKo.Value>
    //Text requirement
    @GET("/jokes/random")
    fun getJokeCharacter(@Query("firstName") firstName : String,
                         @Query("lastName") lastName : String) : Observable<JokesPoKo.Value>
    //batches of 20
    @GET("jokes/random/20")
    fun getJokesBatch() : Observable<JokesPoKo.Value>

    companion object {
//        val baseUrl = context.getString(R.string.base_url)
        val baseUrl = "http://api.icndb.com"
        fun create(): IcndbService{
            val retrofit = Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(baseUrl)
                .build()
            return retrofit.create(IcndbService::class.java)
        }
    }
}