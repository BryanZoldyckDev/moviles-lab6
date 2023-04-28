package com.labo5_moviles.repositories

import com.labo5_moviles.data.model.MovieModel

class MovieRepository(private val movies: MutableList<MovieModel>){
    fun getMovies() = movies;

    fun addMovies(movie: MovieModel) = movies.add(movie)
}