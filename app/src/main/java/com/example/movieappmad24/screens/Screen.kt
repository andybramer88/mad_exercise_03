package com.example.movieappmad24.screens

const val DETAIL_ARGUMENT_KEY = "id"
sealed class Screen (val route: String){
    object Home: Screen(route = "home_screen")
    object Detail: Screen(route = "detail_screen/{$DETAIL_ARGUMENT_KEY}")
}