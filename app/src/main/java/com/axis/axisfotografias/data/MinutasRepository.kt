package com.axis.axisfotografias.data

import com.axis.axisfotografias.Minuta
import com.axis.axisfotografias.data.daos.MinutaDao
import com.axis.axisfotografias.data.entityes.MinutasEntity

data class MinutasRepository(
    private val minutaDao: MinutaDao
){
    suspend fun getAllM(): List<Minuta>{
        val minutaEntities = minutaDao.getAllM()
        return minutaEntities.map {
            Minuta(minuta = it.minuta,
                asignadoA = it.asignadoA,
                codVialidad = it.codVialidad,
                fechaReg = it.fechaReg,
                inspectorSel = it.inspectorSel
                )

        }
    }

   suspend fun insertM(minuta: Minuta, asignadoA: String, codVialidad: String, fechaReg: String, inspectorSel: String){
        val insetMinutaEntity = MinutasEntity(
            minuta = minuta.minuta,
            asignadoA = asignadoA,
            codVialidad = codVialidad,
            fechaReg = fechaReg,
            inspectorSel = inspectorSel
            )

        minutaDao.insertM(insetMinutaEntity)

    }

    suspend fun deleteM(minuta: Minuta){
        minutaDao.borrarM(minuta.minuta)
    }
}
