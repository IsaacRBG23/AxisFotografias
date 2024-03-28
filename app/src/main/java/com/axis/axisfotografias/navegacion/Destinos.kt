package com.axis.axisfotografias.navegacion

sealed class Destinos(
    val route: String
){
    object  InicioCBI: Destinos("InicioCBI")
    object  CreacionMinuta: Destinos("CreacionMinuta")
    object NuevoBache: Destinos("VistaNewMinutas")
}
