package com.isaacpodev.filmcity_jetpackcompose.featuredpage.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.isaacpodev.filmcity_jetpackcompose.R

@Preview(showBackground = true)
@Composable
fun FeaturedScreen() {
    Column(Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())) {
        ActionMovies()
        ScaryMovies()
        ComedyMovies()
        CrimeMovies()
    }
}

@Composable
fun ColumnScope.CrimeMovies() {
    Column(modifier = Modifier
        .fillMaxWidth()
        .weight(1f)) {
        Text(text = "Crimen", textAlign = TextAlign.Start, modifier = Modifier.padding(5.dp))
        LazyRow() {
            item { MovieItem() }
            item { MovieItem() }
            item { MovieItem() }
            item { MovieItem() }
            item { MovieItem() }
            item { MovieItem() }
            item { MovieItem() }
        }
    }
}

@Composable
fun ColumnScope.ComedyMovies() {
    Column(modifier = Modifier
        .fillMaxWidth()
        .weight(1f)) {
        Text(text = "Comedia", textAlign = TextAlign.Start, modifier = Modifier.padding(5.dp))
        LazyRow() {
            item { MovieItem() }
        }
    }

}

@Composable
fun ColumnScope.ScaryMovies() {
    Column(modifier = Modifier
        .fillMaxWidth()
        .weight(1f)) {
        Text(text = "Terror", textAlign = TextAlign.Start, modifier = Modifier.padding(5.dp))
        LazyRow() {
            item { MovieItem() }
        }
    }
}

@Composable
fun ColumnScope.ActionMovies() {
    Column(modifier = Modifier
        .fillMaxWidth()
        .weight(1f)) {
        Text(text = "Acción", textAlign = TextAlign.Start, modifier = Modifier.padding(5.dp))
        LazyRow() {
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