package com.axis.axisfotografias.screens

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.axis.axisfotografias.viewModel.SharedViewModel
import com.axis.axisfotografias.Destinos.*
import com.axis.axisfotografias.screens.Login

@Composable
fun NaviHost(sharedViewModel: SharedViewModel) {
    val navController = rememberNavController()
    val sharedViewModel: SharedViewModel = viewModel()


    NavHost(navController = navController, startDestination = InicioCBI.route) {
        
        composable(InicioCBI.route) {
            Login(
                navegarCreacionMinuta = {
                    navController.navigate(CreacionMinuta.route)
                },
                sharedViewModel = sharedViewModel
            )
        }
        composable(CreacionMinuta.route) {
            CreacionMinuta(
                ventanaDialogo = {
                    navController.navigate(InicioCBI.route)
                },
                sharedViewModel = sharedViewModel,
                onBackPressed = { Unit },
                CerrarSesion = {
                    navController.navigate(InicioCBI.route)

                },
               MinutasVialidades = viewModel()
            )
        }
        composable(NuevoBache.route) {

        }
    }
}
