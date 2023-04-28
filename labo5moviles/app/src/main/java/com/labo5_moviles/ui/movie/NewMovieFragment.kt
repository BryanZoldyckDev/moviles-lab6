package com.labo5_moviles.ui.movie

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.activityViewModels
import com.labo5_moviles.R
import com.labo5_moviles.data.model.MovieModel
import com.labo5_moviles.data.name


/**
 * A simple [Fragment] subclass.
 * Use the [NewMovieFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class NewMovieFragment : Fragment() {

    private val movieViewModel: MovieViewModel by activityViewModels {
        MovieViewModel.Factory
    }

    private lateinit var nameEditText: EditText
    private lateinit var categoryEditText: EditText
    private lateinit var descriptionEditText: EditText
    private lateinit var calificationEditText: EditText
    private lateinit var submitButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_new_movie, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind();
        listener()
    }

    fun bind() {
        nameEditText = view?.findViewById(R.id.name_textfield_createnewmovie) !!
        categoryEditText = view?.findViewById(R.id.category_textfield_createnewmovie) !!
        descriptionEditText = view?.findViewById(R.id.description_textfield_createnewmovie) !!
        calificationEditText = view?.findViewById(R.id.calification_textfield_createnewmovie) !!
        submitButton = view?.findViewById(R.id.button_createnewmovie) !!
    }

    fun listener() {
        submitButton.setOnClickListener{

            val newMovie = MovieModel(
                nameEditText.text.toString(),
                categoryEditText.text.toString(),
                descriptionEditText.text.toString(),
                calificationEditText.text.toString(),)

            movieViewModel.addMovies(newMovie)

            Log.d("movie", movieViewModel.getMovies().toString())
        }
    }
}