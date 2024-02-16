package com.sevban.network.source.remote

import com.sevban.network.source.model.CharacterDTO
import com.sevban.network.source.model.CharactersDTO
import kotlinx.coroutines.flow.Flow

interface RemoteDataSource {
    suspend fun getAllCharacters(): Flow<CharactersDTO>
    suspend fun getCharacterById(id: String): Flow<CharacterDTO>
}