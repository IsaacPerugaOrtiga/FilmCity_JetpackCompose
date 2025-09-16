package com.isaacpodev.filmcity_jetpackcompose.searchpage.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.isaacpodev.filmcity_jetpackcompose.R

@Preview
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchScreen(){
    Column (modifier = Modifier.fillMaxSize()){
        SearchBar(
            inputField = { },
            onExpandedChange = {},
            expanded = false
        ) { }
        ImagesCarrusel()
        MoviesList()
    }
}

@Composable
fun MoviesList() {
    Column(modifier = Modifier.fillMaxWidth()) {
        LazyVerticalGrid(
            columns = GridCells.Adaptive(minSize = 105.dp)
        ) {
            item { MovieItem() }
            item { MovieItem() }
            item { MovieItem() }
        }
    }
}

@Composable
fun ImagesCarrusel() {

}

@Composable
fun MovieItem(){
    Card(modifier = Modifier.padding(8.dp).fillMaxHeight()) {
        Image(painter = painterResource(R.drawable.ic_launcher_background), contentDescription = "", modifier = Modifier.align(
            Alignment.CenterHorizontally))
        Text(text = "nombre pelicula", textAlign = TextAlign.Center, fontWeight = FontWeight.Bold)
    }
}