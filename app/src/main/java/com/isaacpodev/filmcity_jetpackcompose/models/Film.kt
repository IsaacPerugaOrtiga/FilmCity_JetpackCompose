package com.isaacpodev.filmcity_jetpackcompose.models

import com.google.gson.annotations.SerializedName

data class Film(
    @SerializedName("id") val id: Int,
    @SerializedName("title") val title: String,
    @SerializedName("original_title") val originalTitle: String,
    @SerializedName("overview") val overview: String,
    @SerializedName("poster_path") val posterPath: String,
    @SerializedName("backdrop_path") val backdropPath: String,
    @SerializedName("release_date") val releaseDate: String,
    @SerializedName("vote_average") val voteAverage: Double,
    val favorite : Boolean,
    val personalPuntuation: Int
)
