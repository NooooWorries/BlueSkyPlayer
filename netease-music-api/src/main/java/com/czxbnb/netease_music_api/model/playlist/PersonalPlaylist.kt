package com.czxbnb.netease_music_api.model.playlist


data class PersonalPlaylist(
    val code: Int,
    val more: Boolean,
    val playlist: List<Playlist>,
    val version: String
)

