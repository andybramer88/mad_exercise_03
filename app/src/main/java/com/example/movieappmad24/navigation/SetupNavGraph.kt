package com.example.movieappmad24.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.movieappmad24.models.getMovies
import com.example.movieappmad24.screens.DETAIL_ARGUMENT_KEY
import com.example.movieappmad24.screens.DetailScreen
import com.example.movieappmad24.screens.HomeScreen
import com.example.movieappmad24.screens.Screen


@Composable
fun MyNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "homescreen"
    ) {
        composable(route = "homescreen") {
            HomeScreen(navController = navController)
        }
        composable(
            route = "detailscreen/{movieId}",
            arguments = listOf(
                navArgument(name = "movieId") {
                    type = NavType.StringType
                }
            )
        ) { backStackEntry ->
            DetailScreen(
                navController = navController,
                movieId = backStackEntry.arguments?.getString("movieId")
            )
        }
    }
}


/*
@Composable
fun SetupNavGraph(
    //navController: NavHostController
){
    val navController = rememberNavController()
    //val navController: NavHostController

    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(
            route = Screen.Home.route
        ) {
                HomeScreen(navController = navController)
        }
        composable(
            route = Screen.Detail.route,
            arguments = listOf(navArgument(DETAIL_ARGUMENT_KEY){
                    type = NavType.StringType
                }
            )
        ) {backStackEntry ->
            DetailScreen(navController = navController,
                movieId = backStackEntry.arguments?.getString(DETAIL_ARGUMENT_KEY))
        }
    }
}*/