package com.axis.axisfotografias.screens

import android.annotation.SuppressLint
import android.widget.Toast
import kotlin.random.Random
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.axis.axisfotografias.viewModel.SharedViewModel
import com.axis.bacheo_fotografias_inspeccion.R
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale


/*
Aqui se almacenaran los datos que son de la minuta fecha, minuta, vialidad, inspector, asignado a, etc
 */
data class DatosMinuta(
    val minutaFinal: String,
    val codigoVialidad: String,
    val asignadoA: String,
    val fechaHora: String,
    val nombreInspec: String,
)

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Suppress("UnsafeOptInUsageError")
@Composable
fun Login(
    navegarCreacionMinuta: () -> Unit,
    sharedViewModel: SharedViewModel = viewModel()
) {
    val context = LocalContext.current

    // Utiliza LaunchedEffect para manejar el ciclo de vida de ExoPlayer


    var expanded by remember { mutableStateOf(false) }
    var selectedText by remember { mutableStateOf(sharedViewModel.selectedInspector.value) }



    Box(
        modifier = Modifier.fillMaxSize()
    ) {

        Image(
            painter = painterResource(id = R.drawable.sesion_fondo),
            contentDescription = null,
            modifier = Modifier.fillMaxSize()
        )



        Box(
            modifier = Modifier
                .size(height = 620.dp, width = 350.dp)
                .background(Color.White.copy(alpha = 0.3f))
                .align(Alignment.Center)
                .clip(RoundedCornerShape(topStart = 30.dp))
                .clip(RoundedCornerShape(topEnd = 30.dp)), contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.axis_logo_n),
                contentDescription = null,
                modifier = Modifier
                    .size(250.dp)
                    .offset(x = 0.dp, y = -180.dp)
            )

            ExposedDropdownMenuBox(expanded = expanded, onExpandedChange = { expanded = it }) {

                TextField(value = selectedText,
                    onValueChange = {},
                    readOnly = true,
                    colors = ExposedDropdownMenuDefaults.outlinedTextFieldColors(Color.Black),
                    trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded) },
                    modifier = Modifier
                        .menuAnchor()
                        .clickable { expanded = false }
                        .background(Color.White))

                ExposedDropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }) {
                    val inspectoresAxis = arrayOf(
                        "Rogelio Perez Padilla",
                        "Jose Manuel Gutierrez Sanchez",
                        "Jorge Romero Reyes",
                        "Pruebas Desarrollo"
                    )

                    inspectoresAxis.forEach { item ->
                        DropdownMenuItem(text = { Text(text = item) }, onClick = {
                            selectedText = item
                            sharedViewModel.setSelectedInspector(item)
                            expanded = false
                            //Toast.makeText(context, item, Toast.LENGTH_SHORT).show()
                        })
                    }
                }
            }



            Button(
                onClick = {
                    if (selectedText == "Rogelio Perez Padilla" || selectedText == "Jose Manuel Gutierrez Sanchez" || selectedText == "Jorge Romero Reyes" || selectedText == "Pruebas Desarrollo") {


                        navegarCreacionMinuta()
                    } else if (selectedText == "") {
                        Toast.makeText(
                            context, "Selecciona un usuario para continuar", Toast.LENGTH_SHORT
                        ).show()
                    }
                }, modifier = Modifier

                    .offset(x = 0.dp, y = 180.dp)
            ) {
                Text(text = "Iniciar Sesión")
            }
        }
    }

}

fun generadorMinutaCodigo(inspector: String): String {

    val letrasInspectores = mapOf(
        "Rogelio Perez Padilla" to "R-",
        "Jose Manuel Gutierrez Sanchez" to "M-",
        "Jorge Romero Reyes" to "J-",
        "Pruebas Desarrollo" to "PD-"
    )

    val letraInspector = letrasInspectores[inspector] ?: "X"

    val formatoDia = SimpleDateFormat("EE", Locale.getDefault())
    val letraDia = formatoDia.format(Date()).first().uppercase()

    val random = Random
    val randomValue = random.nextInt(1000, 99999)
    return "$letraInspector$randomValue$letraDia"
}
