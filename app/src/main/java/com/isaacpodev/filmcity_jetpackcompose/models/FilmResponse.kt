package com.isaacpodev.filmcity_jetpackcompose.models

import com.google.gson.annotations.SerializedName

data class FilmResponse(
    @SerializedName("page")
    val page: Int = 0,
    @SerializedName("results")
    val films: MutableList<Film?>? = null,
    @SerializedName("total_pages")
    val totalpages: Int = 0,

    @SerializedName("total_results")
    private val totalResults: Int = 0) {
}