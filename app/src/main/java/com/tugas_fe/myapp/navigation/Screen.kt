package com.tugas_fe.myapp.navigation

sealed class Screen (val route: String){
    data object Home : Screen("home")
    data object Favorite : Screen("favorite")
    data object Profil : Screen("profil")
    data object Detail: Screen("detail_pet")
}