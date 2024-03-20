package com.axis.axisfotografias

sealed class Destinos(
    val route: String
){
    object  InicioCBI: Destinos("InicioCBI")
    object  CreacionMinuta: Destinos("CreacionMinuta")
    object NuevoBache: Destinos("NuevoBache")
}
