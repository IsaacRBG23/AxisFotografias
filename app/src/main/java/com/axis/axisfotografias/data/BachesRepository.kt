package com.axis.axisfotografias.data

import com.axis.axisfotografias.Bache
import com.axis.axisfotografias.data.daos.BachesDao

data class BachesRepository(
    private val bachesDao: BachesDao
){
    suspend fun getAllB(): List<Bache>{
        val bacheEntities = bachesDao.getAllB()
        return bacheEntities.map {
            Bache(
                latitud = it.latitud,
                longitud = it.longitud,
                minutaAsignada = it.minutaAsignada,
                noBache = it.noBache,
                fotoUno = it.fotoUno,
                fotoDos = it.fotoDos,
                ancho = it.ancho,
                largo = it.Largo,
                bOrc = it.bOrc,
                cuerpo = it.cuerpo,
                carril = it.carril,
                bacheUrgente = it.bacheUrgente
                )
        }
    }
}
