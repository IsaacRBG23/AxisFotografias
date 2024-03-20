package com.axis.axisfotografias.viewModel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class MinutasVialidades: ViewModel(){



    private val _vialidadesGuardadas = mutableStateListOf<String>()
    val vialidadesGuardadas: List<String> get() = _vialidadesGuardadas

    private val _selectedVialidad = mutableStateOf("")
    val selectedVialidad: State<String> get() = _selectedVialidad

    fun setSelectVialidad(vialidad: String){
        _selectedVialidad.value = vialidad
    }

    private val _selectedContratista = mutableStateOf("")
    val selectedContratista: State<String> get() = _selectedContratista

    fun setSelectedContratista(contratistas: String){
        _selectedContratista.value = contratistas
    }
    fun guardarVialidad(vial: String){
        _vialidadesGuardadas.add(vial)
    }

    fun obtenerVialidad(): String{
        return _selectedVialidad.value
    }
    fun obtenerContratista(): String{
        return _selectedContratista.value
    }

}