package com.example.movieappmad24.functions

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ShapeDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.movieappmad24.models.Movie
import com.example.movieappmad24.screens.MovieCardHeader
import com.example.movieappmad24.screens.MovieDetails

@Composable
fun MovieRow(movie: Movie){
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(5.dp),
        shape = ShapeDefaults.Large,
        elevation = CardDefaults.cardElevation(10.dp)
    ) {
        Column {

            MovieCardHeader(imageUrl = movie.images[0])


            MovieDetails(modifier = Modifier.padding(12.dp), movie = movie)

        }
    }
}