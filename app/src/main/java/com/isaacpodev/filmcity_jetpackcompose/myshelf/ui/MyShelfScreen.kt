package com.isaacpodev.filmcity_jetpackcompose.myshelf.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.isaacpodev.filmcity_jetpackcompose.R
import com.isaacpodev.filmcity_jetpackcompose.searchpage.ui.MovieItem

@Composable
fun MyShelfScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        MyShelfList()
    }
}

@Composable
fun MyShelfList() {
    Column(modifier = Modifier.fillMaxWidth()) {
        LazyVerticalGrid(
            columns = GridCells.Adaptive(minSize = 105.dp)) {
                item { MovieItem() }
                item { MovieItem() }
                item { MovieItem() }
            }
    }
}

@Composable
fun MovieItem() {
    Card(modifier = Modifier
        .padding(8.dp)
        .fillMaxHeight()) {
        Image(painter = painterResource(R.drawable.ic_launcher_background), contentDescription = "")
        Text(text = "nombre pelicula", textAlign = TextAlign.Center, fontWeight = FontWeight.Bold)
    }
}