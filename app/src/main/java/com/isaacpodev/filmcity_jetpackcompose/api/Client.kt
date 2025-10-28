package com.isaacpodev.filmcity_jetpackcompose.api

import android.content.Context
import com.isaacpodev.filmcity_jetpackcompose.R
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Client {

    var retrofit: Retrofit? =  null

    fun getCliente(context: Context): Retrofit {
        if (retrofit == null) {
            val url = context.getString(R.string.api_url_moviedb)
            retrofit = Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create()) //Se convierte el JSON a objetos, si no se pone esto, se produce un error
                .build()
        }
        return retrofit!!
    }

}