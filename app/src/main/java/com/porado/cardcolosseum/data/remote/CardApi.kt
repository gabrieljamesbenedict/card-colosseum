package com.porado.cardcolosseum.data.remote

import com.porado.cardcolosseum.data.model.Card

val uri: String = "http://13.229.29.246:8080/api/cards";

suspend fun getAllCards(): List<Card> {

    return TODO()
}

suspend fun getCard(id: Long): Card {

    return TODO();
}