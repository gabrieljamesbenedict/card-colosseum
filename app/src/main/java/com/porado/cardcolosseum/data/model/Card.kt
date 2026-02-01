package com.porado.cardcolosseum.data.model

data class Card (
    var id: Long?,
    var name: String,
    var description: String,
    var manaCost: Int,
    var attackPower: Int,
    var defensePower: Int,
    var ability: String?
);