package com.axis.axisfotografias.data

import android.app.Application
import androidx.room.Room
import com.axis.axisfotografias.data.database.MinutasDB

class MinutasApp : Application(){

    val room = Room.databaseBuilder(this, MinutasDB::class.java, "minutas").build()

}