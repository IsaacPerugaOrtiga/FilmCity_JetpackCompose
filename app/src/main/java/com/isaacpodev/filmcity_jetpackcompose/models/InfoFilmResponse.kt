package com.isaacpodev.filmcity_jetpackcompose.models

import com.google.gson.annotations.SerializedName

data class InfoFilmResponse(
    @SerializedName("id")
    val idFilm: Int,
    @SerializedName("overview")
    val synopsis: String,

    @SerializedName("tagline")
    val tagline: String,

    @SerializedName("original_language")
    val laguage: String,

    @SerializedName("runtime")
    val duration: Int,

    @SerializedName("genres")
    var genres: MutableList<Genre?>
)
