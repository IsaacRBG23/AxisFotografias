package com.axis.axisfotografias.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.axis.axisfotografias.data.daos.MinutaDao
import com.axis.axisfotografias.data.entityes.MinutasEntity


@Database(
    entities = [MinutasEntity::class],
    version = 6, exportSchema = false
)
abstract class MinutasDB : RoomDatabase() {

        abstract val dao: MinutaDao

}