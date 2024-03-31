package com.example.movieappmad24

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.movieappmad24.functions.MovieRow
import com.example.movieappmad24.models.Movie
import com.example.movieappmad24.navigation.MyNavigation
import com.example.movieappmad24.screens.HomeScreen
import com.example.movieappmad24.ui.theme.MovieAppMAD24Theme

class MainActivity : ComponentActivity() {

    //lateinit var navController: NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //MovieAppMAD24Theme {
            // A surface container using the 'background' color from the theme
            // Test
            MyNavigation()
            //navController = rememberNavController()
            //SetupNavGraph(navController = navController)
        }
    }
}

