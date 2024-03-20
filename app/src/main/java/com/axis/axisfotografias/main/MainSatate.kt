package com.axis.axisfotografias.main

import com.axis.axisfotografias.Minuta

data class MainSatate(
    val minuta: String = "",
    val asignadoA: String = "",
    val codVialidad: String = "",
    val fechaReg: String = "",
    val inspectorSel: String = "",
    val minutas: List<Minuta> = emptyList()
)