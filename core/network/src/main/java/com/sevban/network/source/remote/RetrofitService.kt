package com.sevban.network.source.remote

import com.sevban.network.source.model.CharacterDTO
import com.sevban.network.source.model.CharactersDTO
import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET
import retrofit2.http.Path

interface RetrofitService {

    @GET("character")
    suspend fun getAllCharacters(): Flow<CharactersDTO>

    @GET("character/{id}")
    suspend fun getSingleCharacter(@Path("id") id: String): Flow<CharacterDTO>
}
