package com.sevban.data.mapper

import com.sevban.model.Character
import com.sevban.network.source.model.CharacterDTO

fun CharacterDTO.toCharacter() = Character(
    id = id.toString(),
    name = name.orEmpty(),
)