package com.sevban.network.source.remote

import com.sevban.network.source.model.CharacterDTO
import com.sevban.network.source.model.CharactersDTO
import retrofit2.http.GET
import retrofit2.http.Path

interface RetrofitService {

    @GET("character")
    suspend fun getAllCharacters(): CharactersDTO

    @GET("character/{id}")
    suspend fun getCharacterById(@Path("id") id: String): CharacterDTO
}
