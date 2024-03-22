package com.axis.axisfotografias

data class Bache(
    val latitud : Double,
    val longitud : Double,
    val minutaAsignada : String,
    val noBache : Int,
    val fotoUno : String,
    val fotoDos : String,
    val ancho : Double,
    val largo : Double,
    val bOrc : Char,
    val cuerpo : Char,
    val carril : Int,
    val bacheUrgente : Boolean
)
