package com.isaacpodev.filmcity_jetpackcompose.mainscreen

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AcUnit
import androidx.compose.material.icons.filled.NightShelter
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.isaacpodev.filmcity_jetpackcompose.featuredpage.ui.FeaturedScreen
import com.isaacpodev.filmcity_jetpackcompose.myshelf.ui.MyShelfScreen
import com.isaacpodev.filmcity_jetpackcompose.searchpage.ui.SearchScreen

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun MainScreen() {

    val navItemList = listOf(
        NavItem("Destacados", Icons.Default.AcUnit),
        NavItem("Buscar", Icons.Default.Search),
        NavItem("Mi estante", Icons.Default.NightShelter)
    )
    var selectedIndex by remember { mutableIntStateOf(0) }
    Scaffold(
        modifier = Modifier.fillMaxSize(),
//        topBar = {
//            TopAppBar(
//                title = { Text(text = "") },
//                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.Red)
//            )
//        },
        bottomBar = {
            NavigationBar {
                navItemList.forEachIndexed { index, navItem ->
                    NavigationBarItem(
                        selected = selectedIndex == index,
                        onClick = { selectedIndex = index },
                        icon = { Icon(imageVector = navItem.icon, contentDescription = "Icon") },
                        label = { Text(text = navItem.label) })
                }

            }
        }
    ) { innerPadding ->
        ContentScreen(modifier = Modifier.padding(innerPadding), selectedIndex)

    }
}

@Composable
fun ContentScreen(modifier: Modifier, selectedInt: Int) {
    when (selectedInt) {
        0 -> FeaturedScreen()
        1 -> SearchScreen()
        2 -> MyShelfScreen()
    }
}