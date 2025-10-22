package com.isaacpodev.filmcity_jetpackcompose.models

import com.google.gson.annotations.SerializedName

data class Trailer(
    @SerializedName("key")
    val key: String,
    @SerializedName("name")
    val name: String
)

data class TrailerResponse(
    @SerializedName("id")
    private var idTrailer: Int,
    @SerializedName("results")
    private val results: MutableList<Trailer>
)
