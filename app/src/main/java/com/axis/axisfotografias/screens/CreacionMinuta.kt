package com.axis.axisfotografias.screens

import android.annotation.SuppressLint
import android.content.Intent
import android.widget.Toast
import com.axis.axisfotografias.desactivarBotonBack
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.zIndex
import androidx.lifecycle.viewmodel.compose.viewModel
import com.axis.axisfotografias.Minuta
import com.axis.bacheo_fotografias_inspeccion.R
import com.axis.axisfotografias.elementos.Seccion
import com.axis.axisfotografias.elementos.elementsConstans
import com.axis.axisfotografias.viewModel.SharedViewModel
import com.axis.axisfotografias.viewModel.MinutasVialidades
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@SuppressLint("SuspiciousIndentation")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CreacionMinuta(
    ventanaDialogo: () -> Unit,
    sharedViewModel: SharedViewModel,
    onBackPressed: () -> Unit,
    CerrarSesion: () -> Unit,
    MinutasVialidades: MinutasVialidades = viewModel(),
    desactivarBotonBack: desactivarBotonBack = viewModel(),
    navNewMinuata: () -> Unit


    ) {


    desactivarBotonBack.DisiableBackButtonBehaivor(onBackPressed = onBackPressed) {}

    val minutasInspectorMap = mapOf(
        "Rogelio Perez Padilla" to "R-",
        "Jose Manuel Gutierrez Sanchez" to "M-",
        "Jorge Romero Reyes" to "J-",
        "Pruebas Desarrollo" to "PD-"
    )
    val vialidadConst = elementsConstans.vialidadesA
    val state = sharedViewModel.state
    val context = LocalContext.current
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    var  opcionesMinutaM by remember { mutableStateOf(false) }
    val inspectorValue = sharedViewModel.selectedInspector.value
    var showDialog by remember { mutableStateOf(false) }
    var expanded by remember { mutableStateOf(false) }
    var expanded2 by remember { mutableStateOf(false) }
    var selecVialidad by remember { mutableStateOf(MinutasVialidades.selectedVialidad.value) }
    var seleccontratista by remember { mutableStateOf(MinutasVialidades.selectedContratista.value) }
    val orange = Color(red = 255, green = 140, blue = 0)
    val black = Color(red = 0, green = 0, blue = 0)
    val white = Color(red = 255, green = 255, blue = 255)


    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp) // Altura sugerida
                .background(Color(red = 255, green = 140, blue = 0))
        ) {
            Text(
                text = "Minutas de $inspectorValue",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier.align(Alignment.Center) // Centrar título
            )
            Button(
                modifier = Modifier.align(Alignment.TopStart),
                onClick = { },
                colors = ButtonDefaults.buttonColors(Color.Transparent),
                shape = RectangleShape
            ) {
                Icon(
                    imageVector = Icons.Default.Menu,
                    contentDescription = null,
                    modifier = Modifier.size(35.dp),
                    tint = Color.White
                )
            }

        }






//Este es mi menu desplegable por medio de gesto
        ModalNavigationDrawer(
            drawerState = drawerState, drawerContent = {
                ModalDrawerSheet {
                    Image(
                        painter = painterResource(
                            id = R.drawable.axis_blanco
                        ),
                        contentDescription = null,
                        modifier = Modifier
                            .size(150.dp)
                            .clip(CircleShape)
                            .align(Alignment.CenterHorizontally)
                    )

                    Text(
                        "$inspectorValue",
                        modifier = Modifier
                            .padding(16.dp)
                            .wrapContentSize(Alignment.Center)
                    )

                    Divider()
// Boton con icono de actualizacion que buscara en un repositorio de github para estar actualizando
                    NavigationDrawerItem(label = {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.End
                        ) {

                            Icon(
                                modifier = Modifier.padding(start = 8.dp),
                                imageVector = Icons.Default.Info,
                                contentDescription = null
                            )
                        }
                        Text(text = "Buscar Actualizaciones")
                    }, selected = false, onClick = { /*TODO*/ })


//Boton para cerrar sesion con su respectivo icono de salida
                    NavigationDrawerItem(label = {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.End
                        ) {
                            Icon(
                                imageVector = Icons.Default.ExitToApp, contentDescription = null
                            )
                        }

                        Text(text = "Cerrar sesion")

                    }, selected = false, onClick = { CerrarSesion() })
                }
            }, gesturesEnabled = true
        ) {
//Aqui termina mi menu desplegable por medio de gesto






//Mis items o minutas que se iran agregando en mi lazzy comlumn
            var seleccionMinutaActual: Minuta? = null

            Column(modifier = Modifier.fillMaxWidth()) {
                //Lista donde se encuentran almacenadas las minutas
                LazyColumn(
                    modifier = Modifier.offset(y = 60.dp)

                ) {
                    val filtroMinutasI = state.minutas.filter { minutasItems ->
                        val inspector = sharedViewModel.selectedInspector.value
                        minutasInspectorMap[inspector]?.let { prefix ->
                            minutasItems.minuta.startsWith(prefix)
                        } ?: false
                    }
                    items(filtroMinutasI) {
                        Column(
                            modifier = Modifier
                                .padding(16.dp)
                                .padding(bottom = 70.dp)
                                .fillMaxWidth()
                        ) {
                            val minutaB = Minuta(
                                it.minuta,
                                it.asignadoA,
                                it.codVialidad,
                                it.fechaReg,
                                it.inspectorSel
                            )

                            Button(onClick = {
                                opcionesMinutaM = true
                                seleccionMinutaActual = Minuta(
                                    it.minuta,
                                    it.asignadoA,
                                    it.codVialidad,
                                    it.fechaReg,
                                    it.inspectorSel
                                )

                            }) {
                                Icon(imageVector = Icons.Default.MoreVert, contentDescription = null)
                            }


                            Button(
                                onClick = { sharedViewModel.deteleMinuta(minutaB) },
                                colors = ButtonDefaults.buttonColors(
                                    Color.Transparent
                                ), modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(start = 150.dp)
                            )

                            {
                                Icon(
                                    imageVector = Icons.Default.Delete,
                                    contentDescription = null,
                                    tint = Color.Red
                                )

                            }
                            Text(
                                text = "MINUTA: ${it.minuta}",
                                //text = ,
                                style = MaterialTheme.typography.bodyLarge, color = Color.Black
                            )
                            Text(
                                text = "COD. VIALIDAD: ${it.codVialidad}",
                                style = MaterialTheme.typography.bodyLarge,
                                color = Color.Black
                            )

                            Text(
                                text = "ASIGNADO A: ${it.asignadoA}",
                                style = MaterialTheme.typography.bodyLarge,
                                color = Color.Black
                            )

                            Text(
                                text = "FECHA CAP: ${it.fechaReg}",
                                style = MaterialTheme.typography.bodyLarge,
                                color = Color.Black
                            )

                            Text(
                                text = "INSPECTOR: ${it.inspectorSel}",
                                style = MaterialTheme.typography.bodyLarge,
                                color = Color.Black
                            )
                            Divider(color = Color.Gray, thickness = 1.dp)
                        }

                    }
                }


            }

            if (opcionesMinutaM){
                val minutaActual = seleccionMinutaActual
                Dialog(onDismissRequest = {opcionesMinutaM = false}) {
                    Card(modifier = Modifier
                        .width(300.dp)
                        .height(350.dp))
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
                        Column( // Usa Column para mejor distribuir el contenido
                            modifier = Modifier
                                .fillMaxSize()
                                .background(Color.White),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally

                        ) {
                            Button(onClick = { /*TODO*/ }) {
                                Icon(imageVector = Icons.Default.Add, contentDescription = null )
                            }

                            Button(onClick = { opcionesMinutaM = false }) {
                                        Icon(imageVector = Icons.Default.Delete, contentDescription = null)
                            }

                            Button(onClick = { navNewMinuata() }) {

                            }

                        }
                    }

                }
            }





            /*
            Todo lo que va dentro del modal navigation va por debajo del mismo
             */





            // Botón para agregar las minutas
            Button(
                modifier = Modifier
                    .offset(x = 330.dp, y = 800.dp)
                    .size(80.dp)
                    .zIndex(1f), // Asegúrate de que el zIndex del botón sea menor que el del ModalDrawer
                onClick = {
                    val nuevaMinuta = generadorMinutaCodigo(sharedViewModel.selectedInspector.value)
                    sharedViewModel._minutaGenerada.value = nuevaMinuta


                    showDialog = true
                }, colors = ButtonDefaults.buttonColors(Color(255, 69, 0))
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = null,
                    modifier = Modifier.size(50.dp),
                    tint = Color(255, 255, 255)
                )
            }


            // Tarjeta Dialog que estará arriba de la pantalla principal
            if (showDialog) {
                Dialog(onDismissRequest = { showDialog = false }) {
                    Card(
                        modifier = Modifier
                            .width(500.dp) // Ajusta el tamaño si es necesario
                            .height(550.dp)


                        //.padding(8.dp)
                    ) {

                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(75.dp)
                                .background(Color(255, 140, 0)) // Color naranja

                        ) {
                            Text(
                                text = "Agregar Minuta",
                                color = Color.White,
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                                textAlign = TextAlign.Center,
                                modifier = Modifier.align(Alignment.Center)
                            )
                        }
                        Column( // Usa Column para mejor distribuir el contenido
                            modifier = Modifier
                                .fillMaxSize()
                                .background(Color.White),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally

                        ) {


                            Text(
                                text = "Minuta: ${sharedViewModel.minutaGenerada.value}",
                                color = black
                            )

                            Text(text = "Vialidad: ", color = black)


                            //////////////////////////////////////////////////////////////////7
                            ExposedDropdownMenuBox(
                                expanded = expanded,
                                onExpandedChange = { expanded = it }) {

                                TextField(value = selecVialidad,
                                    onValueChange = {},
                                    colors = ExposedDropdownMenuDefaults.outlinedTextFieldColors(
                                        Color.Black
                                    ),
                                    readOnly = true,
                                    trailingIcon = {
                                        ExposedDropdownMenuDefaults.TrailingIcon(
                                            expanded = expanded
                                        )
                                    },
                                    modifier = Modifier
                                        .menuAnchor()
                                        .clickable { expanded = !expanded }
                                        .background(Color.White)

                                )


                                ExposedDropdownMenu(expanded = expanded,
                                    modifier = Modifier.background(white),
                                    onDismissRequest = { expanded = false }) {


                                    Seccion.vialidades.forEach { vialidad ->
                                        DropdownMenuItem(text = {
                                            Text(
                                                text = vialidad.nombre, color = orange
                                            )
                                        }, onClick = {
                                            selecVialidad = vialidad.nombre
                                            MinutasVialidades.setSelectVialidad(vialidad.nombre)
                                            expanded = false
                                        })

                                    }

                                }


                            }

                            Text(text = "Contratista: ", color = black)

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                            ExposedDropdownMenuBox(modifier = Modifier.background(white),
                                expanded = expanded2,
                                onExpandedChange = { expanded2 = it }) {

                                TextField(value = seleccontratista,
                                    onValueChange = {},
                                    readOnly = true,
                                    colors = ExposedDropdownMenuDefaults.outlinedTextFieldColors(
                                        Color.Black
                                    ),
                                    trailingIcon = {
                                        ExposedDropdownMenuDefaults.TrailingIcon(
                                            expanded = expanded2
                                        )
                                    },
                                    modifier = Modifier
                                        .menuAnchor()
                                        .background(white)
                                        .clickable { expanded2 = !expanded2 })
                                ExposedDropdownMenu(modifier = Modifier.background(Color.White),
                                    expanded = expanded2,
                                    onDismissRequest = { expanded2 = false }) {
                                    val contratistasAxis = arrayOf(
                                        "PSC", "Grupo Marval", "Tlaxcallan", "Humberto Carrillo"
                                    )
                                    contratistasAxis.forEach { item2 ->
                                        DropdownMenuItem(modifier = Modifier.background(Color.White),
                                            text = { Text(text = item2, color = orange) },
                                            onClick = {
                                                seleccontratista = item2
                                                MinutasVialidades.setSelectedContratista(item2)
                                                expanded2 = false
                                            })
                                    }
                                }
                            }

                            Text(
                                text = "$inspectorValue",
                            )


                            /* boton que tendra la funcion de gardar todos mis elementos
                               como lo son: Fecha, Minuta generada lasvialidades, los contratistas
                               el inspector que este se enviara a mi SharedView y a mi data class
                               donde estaran almacenados y tendra una sentencia if para validar
                               que mi campo de vialidadesy mi campo de contratistas tenga un valor
                               si es nuelo o esta en  blanco muestra un toast
                             */

                            Button(modifier = Modifier.padding(top = 16.dp),
                                //.background(Color(red = 255, green = 140, blue = 0)),
                                onClick = {

                                    if (selecVialidad == "" && selecVialidad == "") {
                                        Toast.makeText(
                                            context,
                                            "         Debes seleccionar una vialidad y un contratista",
                                            Toast.LENGTH_SHORT
                                        ).show()
                                    } else if (seleccontratista == "") {
                                        Toast.makeText(
                                            context,
                                            "Debes seleccionar un Contratista",
                                            Toast.LENGTH_SHORT
                                        ).show()
                                    } else if (seleccontratista == "") {
                                        Toast.makeText(
                                            context,
                                            "Debes seleccionar una vialidad",
                                            Toast.LENGTH_SHORT
                                        ).show()
                                    } else {

                                        val minutaActual = sharedViewModel.minutaGenerada.value
                                        val insepectorActual =
                                            MinutasVialidades.obtenerContratista()
                                        val codVialidadA = MinutasVialidades.obtenerVialidad()
                                        val fechaActual = LocalDateTime.now().format(
                                            DateTimeFormatter.ofPattern("MMM/dd/yyyy")
                                        )
                                        val inspectorA = sharedViewModel.obtenerInspector()
                                        // val minutaa = Minuta(minutaActual, insepectorActual)
                                        sharedViewModel.saveMinuta(
                                            minutaActual,
                                            insepectorActual,
                                            codVialidadA,
                                            fechaActual,
                                            inspectorA
                                        )

                                        showDialog = false
                                    }
                                } // Cerrar el diálogo
                                , colors = ButtonDefaults.buttonColors(orange)) {
                                Text(text = "Aceptar", color = white)
                            }
                        }
                    }
                }
            }
        }


    }


}
/*
Desactivar boton de regresar para el cierre de inicio de sesion
*/





