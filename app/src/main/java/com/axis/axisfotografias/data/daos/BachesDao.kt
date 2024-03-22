package com.axis.axisfotografias.data.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.axis.axisfotografias.data.entityes.bachesEntity


@Dao
interface BachesDao {

    @Query("Select * from bachesEntity ")
    suspend fun getAllB(): List<bachesEntity>

    @Insert
    suspend fun insertB(bachesEntity: bachesEntity)

}