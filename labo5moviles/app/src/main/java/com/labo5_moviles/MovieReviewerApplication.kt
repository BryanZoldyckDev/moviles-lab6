package com.labo5_moviles

import android.app.Application
import com.labo5_moviles.data.movies
import com.labo5_moviles.repositories.MovieRepository

class MovieReviewerApplication: Application(){
    val movieRepository: MovieRepository by lazy {
        MovieRepository(movies)
    }
}