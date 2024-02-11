package com.sevban.network.source.remote

import com.sevban.network.source.model.CharacterDTO
import com.sevban.network.source.model.CharactersDTO
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class RemoteDataSourceImpl @Inject constructor(private val apiService: RetrofitService) :
    RemoteDataSource {

    override suspend fun getAllCharacters(): Flow<CharactersDTO> {
        return apiService.getAllCharacters()
    }

    override suspend fun getCharacterById(id: String): Flow<CharacterDTO> {
        return apiService.getSingleCharacter(id)
    }
}