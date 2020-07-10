package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val movies = mutableListOf<Movie>()
        movies.add(Movie("Matrix 4", 4))
        movies.add(Movie("MadMax", 5))
        movies.add(Movie("Film C", 4))
        movies.add(Movie("Film D", 5))
        movies.add(Movie("Film E", 2))

       recyclerView.adapter = MovieRecyclerAdapter(movies)

    }


}