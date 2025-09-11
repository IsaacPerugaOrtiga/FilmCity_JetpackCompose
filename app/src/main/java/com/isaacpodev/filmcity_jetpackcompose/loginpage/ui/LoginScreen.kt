package com.isaacpodev.filmcity_jetpackcompose.loginpage.ui

import androidx.compose.foundation.Image
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
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.isaacpodev.filmcity_jetpackcompose.R


@Preview(showBackground = true)
@Composable
fun LoginScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        HeaderLogin(modifier = Modifier.align(Alignment.BottomCenter))
        Body()
        Footer()
    }
}

@Composable
fun Footer() {
    Column(
        Modifier.fillMaxSize().padding(PaddingValues(bottom = 200.dp)),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = {}) {
            Text(text = "Iniciar sesión")
        }
        Spacer(modifier = Modifier.size(8.dp))
        Button(onClick = {}) {
            Text(text = "Registrarse")
        }
        Spacer(modifier = Modifier.size(20.dp))
        Text(
            text = "¿Has olvidado tu contraseña?",
            modifier = Modifier.clickable {},
            textDecoration = TextDecoration.Underline,
            color = Color.Blue
            //style = TextStyle(textDecoration = TextDecoration.Underline)
        )
    }
}

@Composable
fun Body() {
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center) {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Text(
                text = "Usuario",
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(10.dp)
            )

            TextField(
                value = "",
                onValueChange = {},
                placeholder = { Text(text = "Usuario") },
                maxLines = 1,
                singleLine = true,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),

                )
        }
        Spacer(modifier = Modifier.size(16.dp))
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Text(
                text = "Contraseña",
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(10.dp)
            )

            TextField(
                value = "",
                onValueChange = {},
                placeholder = { Text(text = "Contraseña") },
                maxLines = 1,
                singleLine = true,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
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
        Text(text = "FilmCity", modifier = modifier.padding(8.dp))
        Image(
            painter = painterResource(R.drawable.ic_launcher_background),
            contentDescription = "Icon",
            modifier = modifier
        )
    }

}
