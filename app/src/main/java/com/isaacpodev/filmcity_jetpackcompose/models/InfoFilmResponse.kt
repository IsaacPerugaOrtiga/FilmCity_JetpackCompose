package com.isaacpodev.filmcity_jetpackcompose.models

import com.google.gson.annotations.SerializedName

data class InfoFilmResponse(
    @SerializedName("id")
    val idPelicula: Int,
    @SerializedName("overview")
    val sinopsis: String,

    @SerializedName("tagline")
    val tagline: String,

    @SerializedName("original_language")
    val idioma: String,

    @SerializedName("runtime")
    val duracion: Int,

    @SerializedName("genres")
    var generos: MutableList<Genre?>
)
