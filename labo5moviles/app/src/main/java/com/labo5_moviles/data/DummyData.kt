package com.labo5_moviles.data

import com.labo5_moviles.data.model.MovieModel

//model 1
val name = "Scarface"
val category = "Sigma Male"
val description = "Te enseña que The World is Yours"
val qualification = "9.9"

//model 2
val name2 = "Fight Club"
val category2 = "Sigma Male"
val description2 = "Te enseña que Tiri tiri tiri tiri"
val qualification2 = "10"

//model 3
val name3 = "American Psycho"
val category3 = "Sigma Male"
val description3 = "Te enseña You can always Be Thinner Look Better"
val qualification3 = "10"

var movies = mutableListOf(
    MovieModel(name, category, description, qualification),
    MovieModel(name2, category2, description2, qualification2),
    MovieModel(name3, category3, description3, qualification3)
)