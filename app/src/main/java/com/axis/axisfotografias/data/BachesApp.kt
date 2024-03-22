package com.axis.axisfotografias.data

import android.app.Application
import androidx.room.Room
import com.axis.axisfotografias.data.database.BachesDB

class BachesApp : Application() {

    val room = Room.databaseBuilder(this, BachesDB::class.java, "baches").build()
}