package com.axis.axisfotografias.flotingmenu

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog

@Composable
fun opcionesMinuta() {

    var  opcionesMinutaM by remember { mutableStateOf(false) }

    if (opcionesMinutaM){
        Dialog(onDismissRequest = {opcionesMinutaM = false}) {
            Card(modifier = Modifier
                .width(500.dp)
                .height(550.dp))
                {

                Box(modifier = Modifier
                    .fillMaxWidth()
                    .height(75.dp)
                    .background(Color(255, 140, 0))){

                    Text(text = "OPCIONES",
                        color = Color.White,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.align(Alignment.Center)
                    )
                }
            }

        }
    }
}