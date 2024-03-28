package com.axis.axisfotografias

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModelProvider
import androidx.room.Room
import com.axis.axisfotografias.data.BachesRepository
import com.axis.axisfotografias.data.MinutasRepository
import com.axis.axisfotografias.data.database.BachesDB
import com.axis.axisfotografias.data.database.MinutasDB
import com.axis.axisfotografias.navegacion.NaviHost
import com.axis.axisfotografias.viewModel.SharedViewModel
import com.axis.axisfotografias.viewModel.SharedViewModelFactory
import com.axis.bacheo_fotografias_inspeccion.ui.theme.Bacheo_Fotografias_InspeccionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val dbb = Room.databaseBuilder(this, BachesDB::class.java, "baches_db")
            .fallbackToDestructiveMigration().build()
        val daob = dbb.dao
        val repositoryb = BachesRepository(daob)

        val db = Room.databaseBuilder(this, MinutasDB::class.java, "minutas_db")
            .fallbackToDestructiveMigration().build()
        val dao = db.dao
        val repository = MinutasRepository(dao)
        val sharedViewModelFactory = SharedViewModelFactory(repository, repositoryb)
        val sharedViewModel = ViewModelProvider(this, sharedViewModelFactory).get(SharedViewModel::class.java)


        setContent {

            Bacheo_Fotografias_InspeccionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    NaviHost(sharedViewModel)


                }
            }
        }
    }
}


