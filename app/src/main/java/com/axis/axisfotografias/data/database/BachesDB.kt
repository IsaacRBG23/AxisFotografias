package com.axis.axisfotografias.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.axis.axisfotografias.data.daos.BachesDao
import com.axis.axisfotografias.data.entityes.bachesEntity


@Database(
 entities = [bachesEntity::class],
    version = 1
)
abstract class BachesDB : RoomDatabase() {

    abstract val dao : BachesDao

}