package com.axis.axisfotografias.viewModel

import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.axis.axisfotografias.data.MinutasRepository
import com.axis.axisfotografias.main.MainSatate
import com.axis.axisfotografias.Minuta
import com.axis.axisfotografias.screens.generadorMinutaCodigo
import kotlinx.coroutines.launch

class SharedViewModel (private val repository: MinutasRepository): ViewModel(){



    var state by mutableStateOf(MainSatate())
        private set

    init {
        viewModelScope.launch {
            state = state.copy(
                minutas = repository.getAllM()
            )

        }
    }

    fun onMinutaChange(minuta: String){
        state = state.copy(
            minuta = minuta
        )
    }
        fun saveMinuta(minuta: String, asignadoA: String, codVialidad: String, fechaReg: String, inspectorSel: String){

            val minuta = Minuta(
                minuta = minuta,
                asignadoA = asignadoA,
                codVialidad = codVialidad,
                fechaReg = fechaReg,
                inspectorSel = inspectorSel

            )
        viewModelScope.launch {
            repository.insertM(minuta, asignadoA, codVialidad, fechaReg, inspectorSel)
            state = state.copy(
                minutas = repository.getAllM()
            )
        }
    }
    fun deteleMinuta(minuta: Minuta){
        viewModelScope.launch {
            repository.deleteM(minuta)
            state = state.copy(
                minutas = repository.getAllM()
            )
        }
    }



    private val _selectedInspector = mutableStateOf("")
    val selectedInspector: State<String> get() = _selectedInspector

    val _minutaGenerada = mutableStateOf("")
    val minutaGenerada: State<String> get() = _minutaGenerada

    fun setSelectedInspector(inspector: String) {
        _selectedInspector.value = inspector
        _minutaGenerada.value = generadorMinutaCodigo(inspector)

    }

    fun obtenerMinutaGnerada(): String {
        return _minutaGenerada.value
    }

    fun obtenerInspector(): String {
        return _selectedInspector.value
    }



    private val _vialidadesGuardadas = mutableStateListOf<String>()
    val vialidadesGuardadas: List<String> get() = _vialidadesGuardadas

    private val _selectedVialidad = mutableStateOf("")
    val selectedVialidad: State <String> get() = _selectedVialidad

    fun setSelectVialidad(vialidad: String){
        _selectedVialidad.value = vialidad
    }

    private val _selectedContratista = mutableStateOf("")
    val selectedContratista: State <String> get() = _selectedContratista

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