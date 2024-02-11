package com.sevban.network.source.remote

import com.sevban.network.source.model.CharacterDTO
import com.sevban.network.source.model.CharactersDTO
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class RemoteDataSourceImpl @Inject constructor(private val apiService: RetrofitService) :
    RemoteDataSource {

    override suspend fun getAllCharacters(): Flow<CharactersDTO> = flow {
        emit(apiService.getAllCharacters())
    }


    override suspend fun getCharacterById(id: String): Flow<CharacterDTO> = flow {
        emit(apiService.getCharacterById(id))
    }
}