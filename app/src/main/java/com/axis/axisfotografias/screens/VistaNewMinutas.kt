package com.axis.axisfotografias.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.axis.axisfotografias.viewModel.SharedViewModel

@Composable
fun ListMinutasNew(
    sharedViewModel: SharedViewModel
){
    val orange = Color(red = 255, green = 140, blue = 0)
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(40.dp)
        ) {
            Text(text = "Nuevo baches", color = orange)
        }
    }


}

