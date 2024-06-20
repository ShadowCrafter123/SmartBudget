package com.example.smartbudget

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun LoginScreen(){

    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(painter = painterResource(id = R.drawable.logo), contentDescription = "Logo image")

        Spacer(modifier = Modifier.height(64.dp))

        Text(text = "Welcome back", fontSize = 30.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(4.dp))
        
        Text(text = "Login to your account")

        Spacer(modifier = Modifier.height(16.dp))
        
        OutlinedTextField(value = "", onValueChange = {}, label = { Text(text = "Email address")})

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(value = "", onValueChange = {}, label = { Text(text = "Password")})

        Spacer(modifier = Modifier.height(16.dp))
        
        Button(onClick = {   }) {
            Text(text = "Login")
        }

        Spacer(modifier = Modifier.height(32.dp))

        Row {
            Text(text = "No account? ")
            Text(
                text = "Sign up",
                modifier = Modifier.clickable {  }
            )
        }

        Spacer(modifier = Modifier.height(200.dp))


    }


}