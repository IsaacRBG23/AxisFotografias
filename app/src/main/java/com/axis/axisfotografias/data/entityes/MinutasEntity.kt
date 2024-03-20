package com.axis.axisfotografias.data.entityes

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class MinutasEntity(
    @PrimaryKey (autoGenerate = true)
    val id: Int? = null,
    val minuta: String,
    val asignadoA: String,
    val codVialidad: String,
    val fechaReg: String,
    val inspectorSel: String


){


}