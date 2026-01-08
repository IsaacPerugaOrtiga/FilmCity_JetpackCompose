package com.isaacpodev.filmcity_jetpackcompose.loginpage.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.isaacpodev.filmcity_jetpackcompose.R


@Composable
fun LoginScreen(navController: NavController) {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(color = Color(0xFFcc0000))) {
        HeaderLogin(modifier = Modifier.align(Alignment.BottomCenter))
        Body()
        Footer(navController)
    }
}

@Composable
fun Footer(navController: NavController) {
    Column(
        Modifier
            .fillMaxSize()
            .padding(PaddingValues(bottom = 200.dp)),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = { navController.navigate("main") }, colors = ButtonColors(
            contentColor = Color(0xFFFFFFFF),
            containerColor = Color(0xFF1A1A1A),
            disabledContainerColor = Color(0xFF1A1A1A),
            disabledContentColor = Color(0xFFFFFFFF)
        )) {
            Text(text = "Iniciar sesión")
        }
        Spacer(modifier = Modifier.size(8.dp))
        OutlinedButton(onClick = {}, colors = ButtonColors(
            contentColor = Color(0xFFFFFFFF),
            containerColor = Color(0xFFcc0000),
            disabledContentColor = Color(0xFF1A1A1A),
            disabledContainerColor = Color(0xFF1A1A1A)
        ), border = BorderStroke(1.dp,Color.White)
        ) {
            Text(text = "Registrarse")
        }
        Spacer(modifier = Modifier.size(20.dp))
        Text(
            text = "¿Has olvidado tu contraseña?",
            modifier = Modifier.clickable {},
            textDecoration = TextDecoration.Underline,
            color = Color.White.copy(alpha = 0.7f)
            //style = TextStyle(textDecoration = TextDecoration.Underline)
        )
    }
}

@Composable
fun Body() {
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center) {
        var username by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Text(
                text = "Usuario",
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(10.dp),
                color = Color(0xFFFFFFFF)
            )

            TextField(
                value = username,
                onValueChange = { username = it },
                placeholder = { Text(text = "Usuario", color = Color.White) },
                maxLines = 1,
                singleLine = true,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.White.copy(alpha = 0.12f),
                    unfocusedContainerColor = Color.White.copy(alpha = 0.12f),
                    disabledContainerColor = Color.White.copy(alpha = 0.12f),
                    focusedTextColor = Color.White,
                    unfocusedTextColor = Color.White,
                    focusedIndicatorColor = Color.White,
                    unfocusedIndicatorColor = Color.Transparent,
                )
                )
        }
        Spacer(modifier = Modifier.size(16.dp))
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Text(
                text = "Contraseña",
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(10.dp),
                color = Color(0xFFFFFFFF)
            )

            TextField(
                value = password,
                onValueChange = { password = it },
                placeholder = { Text(text = "Contraseña",color = Color.White) },
                maxLines = 1,
                singleLine = true,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.White.copy(alpha = 0.12f),
                    unfocusedContainerColor = Color.White.copy(alpha = 0.12f),
                    disabledContainerColor = Color.White.copy(alpha = 0.12f),
                    focusedTextColor = Color.White,
                    unfocusedTextColor = Color.White,
                    focusedIndicatorColor = Color.White,
                    unfocusedIndicatorColor = Color.Transparent,
                )
            )
        }


    }
}

@Composable
private fun HeaderLogin(modifier: Modifier) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "FilmCity", modifier = modifier.padding(8.dp), color = Color(0xFFFFFFFF))
        Image(
            painter = painterResource(R.drawable.ic_launcher_background),
            contentDescription = "Icon",
            modifier = modifier
        )
    }

}
