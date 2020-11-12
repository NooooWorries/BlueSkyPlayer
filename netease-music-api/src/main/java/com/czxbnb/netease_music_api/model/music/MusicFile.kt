package com.czxbnb.netease_music_api.model.music


data class MusicFile(
    val code: Int,
    val `data`: List<Data>
)

data class Data(
    val br: Int,
    val canExtend: Boolean,
    val code: Int,
    val encodeType: String,
    val expi: Int,
    val fee: Int,
    val flag: Int,
    val freeTrialInfo: Any,
    val freeTrialPrivilege: FreeTrialPrivilege,
    val gain: Int,
    val id: Int,
    val level: String,
    val md5: String,
    val payed: Int,
    val size: Int,
    val type: String,
    val uf: Any,
    val url: String,
    val urlSource: Int
)

data class FreeTrialPrivilege(
    val resConsumable: Boolean,
    val userConsumable: Boolean
)