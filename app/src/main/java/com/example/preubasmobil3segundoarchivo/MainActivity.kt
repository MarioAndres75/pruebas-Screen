package com.example.preubasmobil3segundoarchivo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.core.LinearEasing
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.preubasmobil3segundoarchivo.ui.theme.PreubasMobil3segundoArchivoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PreubasMobil3segundoArchivoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val scrollState = rememberScrollState()
       Column (modifier = Modifier.fillMaxSize(), //pantalla
        horizontalAlignment = Alignment.CenterHorizontally){

        Image(alignment = Alignment.Center,                   //logo
            painter = painterResource(id = R.drawable.logo)
            , contentDescription = "logo"

        )

        Row (modifier = Modifier,                              //botones
            horizontalArrangement = Arrangement.SpaceAround){

            Button(onClick = {}) {
                Column {   Text("MIS")
                    Text("PRODUCTOS")
                }
            }
            Button(onClick = {}) {
                Column {   Text("LISTA DE")
                    Text("COMPRAS")
                }
            }
            Button(onClick = {}) {
                Column {   Text("MIS")
                    Text("NEGOCIOS")
                }
            }

        }
              Column (modifier=Modifier.                                //listade productos
                 fillMaxSize().verticalScroll(scrollState).padding(20.dp)){
             repeat(50){                                     //simulador, debe leer una lista
           Row (modifier = Modifier.fillMaxSize(), horizontalArrangement = Arrangement.SpaceAround){
             Text("producto $it tipo ")
            Button(onClick = { }) { Text(" Agregar a lista  ") }

           }
             }
         }

    }
}





@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PreubasMobil3segundoArchivoTheme {
        Greeting("Android")
    }
}