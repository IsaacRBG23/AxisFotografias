package com.axis.axisfotografias.data.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.axis.axisfotografias.data.entityes.MinutasEntity

@Dao
interface MinutaDao {

    @Query("Select * from MinutasEntity")
    suspend fun getAllM(): List<MinutasEntity>

    @Insert
    suspend fun insertM(minutasEntity: MinutasEntity)

    @Update
    suspend fun updateM(minutasEntity: MinutasEntity)

    @Query("Delete From MinutasEntity Where minuta = :minuta")
    suspend fun borrarM(minuta: String)
}