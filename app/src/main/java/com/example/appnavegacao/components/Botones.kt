package com.example.appnavegacao.components

import android.graphics.drawable.Icon
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
@Preview
@Composable
fun BotonNormal(){
    Button(onClick = { /*TODO*/ }, enabled = false) {
        Text(text = "My Botton", fontSize = 30.sp)
        
    }
}
@Preview
@Composable
fun BotonNormal2(){
    Button(
        onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(
         containerColor = Color(0xFF1119EE)

    )
    ) {
        Text(text = "My Botton", fontSize = 30.sp)
        
    }
}
@Preview
@Composable
fun BotonTexto(){
    TextButton(onClick = { /*TODO*/ }) {
        Text(text = "My Botton", fontSize = 30.sp)
        
    }
}
@Preview
@Composable
fun BotonOutline() {
    OutlinedButton(onClick = { /*TODO*/ }, border = BorderStroke(3.dp, Color.Blue)) {
        Text(text = "My Botton", fontSize = 30.sp)    
    }
}
@Preview
@Composable
fun BotonIcono() {
    IconButton(onClick = { /*TODO*/ }) {
      Icon(
          Icons.Filled.Home,
          contentDescription = "Icono",
          tint = Color(0xFF0D13B3),
          modifier = Modifier.size(50.dp)
      )

    }
}
@Preview
@Composable
fun BotonSwitch(){
    var switched by remember { mutableStateOf(false) }
    Switch(
        checked = switched , onCheckedChange = {switched = it },
        colors = SwitchDefaults.colors(
            checkedThumbColor = Color(0xFFA7A0ED),
            checkedTrackColor = Color(0xFF8728FA),
            uncheckedThumbColor = Color(0xFFA7A0ED),
            uncheckedTrackColor =Color(0xFF7A0EDD)
        )
         )
}


@Composable
fun DarkMode( darkMode: MutableState<Boolean>){
    Button(onClick = { darkMode.value = !darkMode.value}) {
        Icon(imageVector = Icons.Default.Star , contentDescription ="DarkMode" )
        Spacer(modifier = Modifier.width(5.dp))
        Text(text = "Dark Mode", fontSize = 30.sp)

    }
}
@Preview
@Composable
fun FloatingAction() {
    FloatingActionButton(
        onClick = { /*TODO*/ },
        containerColor = Color(0xFF5B09CE),
        contentColor = Color.White
    ) {
       Icon(
           Icons.Filled.Add,
           contentDescription = "",
           modifier = Modifier.size(30.dp)
       ) 
    }
}
@Preview
@Composable
fun Space() {
    Spacer(modifier = Modifier.height(10.dp))
}