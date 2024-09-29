package com.example.uniflix

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var movieAdapter: MovieAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)

        // Criando uma lista de filmes
        val movieList = listOf(
            Movie("Inception", "Sci-Fi", 2010),
            Movie("The Godfather", "Crime", 1972),
            Movie("The Dark Knight", "Action", 2008),
            Movie("Pulp Fiction", "Drama", 1994),
            Movie("Forrest Gump", "Drama", 1994),
            Movie("Fight Club", "Thriller", 1999)
        )

        // Configurando o Adapter
        movieAdapter = MovieAdapter(movieList)
        recyclerView.adapter = movieAdapter
    }
}
