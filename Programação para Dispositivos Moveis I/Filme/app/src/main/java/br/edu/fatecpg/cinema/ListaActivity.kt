package br.edu.fatecpg.cinema

import CinemaDaoImpl
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.edu.fatecpg.cinema.adapters.CinemaAdapter
import br.edu.fatecpg.cinema.models.Cinema
import br.edu.fatecpg.cinema.R

class ListaActivity : AppCompatActivity() {
    val dao = CinemaDaoImpl()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)

        Log.i("FILMES", dao.obterFilmes().toString())
        val rvFilmes = findViewById<RecyclerView>(R.id.rv_filmes)
        val filmes = dao.obterFilmes()

        rvFilmes.layoutManager = LinearLayoutManager(this)
        rvFilmes.adapter = CinemaAdapter(filmes)
        }
    }