package com.axis.axisfotografias.data.entityes

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class bachesEntity (
    @PrimaryKey(autoGenerate = true)
    val idBache : Int? = null,
    val latitud : Double,
    val longitud : Double,
    val minutaAsignada : String,
    val noBache : Int,
    val fotoUno : String,
    val fotoDos : String,
    val ancho : Double,
    val Largo : Double,
    val bOrc : Char,
    val cuerpo : Char,
    val carril : Int,
    val bacheUrgente : Boolean

){
}