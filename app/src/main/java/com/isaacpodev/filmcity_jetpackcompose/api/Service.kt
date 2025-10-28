package com.isaacpodev.filmcity_jetpackcompose.api

import com.isaacpodev.filmcity_jetpackcompose.models.FilmResponse
import com.isaacpodev.filmcity_jetpackcompose.models.InfoFilmResponse
import com.isaacpodev.filmcity_jetpackcompose.models.TrailerResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface Service {
    //Llamada a la API para obtener la lista de peliculas (en este caso se cogeran de la lista de populares)
    @GET("movie/popular?api_key=00411305e33e462ffcc43be5d8f321a5&language=es-ES")
    fun obtenerListaPeliculas(): Call<FilmResponse?>?

    //Llamada a la API para obtener la lista de peliculas que tienen como genero el id 28 (accion)
    @GET("discover/movie?api_key=00411305e33e462ffcc43be5d8f321a5&with_genres=28&include_video=true&language=es-ES&page=1&sort_by=popularity.desc")
    fun obtenerListaPeliculasAccion(): Call<FilmResponse?>?

    //Llamada a la API para obtener la lista de peliculas que tienen como genero el id 35 (comedia)
    @GET("discover/movie?api_key=00411305e33e462ffcc43be5d8f321a5&with_genres=35&include_video=true&language=es-ES&page=1&sort_by=popularity.desc")
    fun obtenerListaPeliculasComedia(): Call<FilmResponse?>?

    //Llamada a la API para obtener la lista de peliculas que tienen como genero el id 80 (crimen)
    @GET("discover/movie?api_key=00411305e33e462ffcc43be5d8f321a5&with_genres=80&include_video=true&language=es-ES&page=1&sort_by=popularity.desc")
    fun obtenerListaPeliculasCrimen(): Call<FilmResponse?>?

    //Llamada a la API para obtener la lista de peliculas que tienen como genero el id 27 (terror)
    @GET("discover/movie?api_key=00411305e33e462ffcc43be5d8f321a5&with_genres=27&include_video=true&language=es-ES&page=1&sort_by=popularity.desc")
    fun obtenerListaPeliculasTerror(): Call<FilmResponse?>?

    //LLamda a la API para obtener los videos/trailers de una pelicula a través de su id
    @GET("movie/{movie_id}/videos?api_key=00411305e33e462ffcc43be5d8f321a5")
    fun obtenerTrailerPelicula(@Path("movie_id") id: Int): Call<TrailerResponse?>?

    //Llamada a la API para obtener la información de una pelicula a través de su id
    @GET("movie/{movie_id}?api_key=00411305e33e462ffcc43be5d8f321a5&language=es-ES")
    fun obtenerInfoPelicula(@Path("movie_id") id: Int): Call<InfoFilmResponse?>?
}