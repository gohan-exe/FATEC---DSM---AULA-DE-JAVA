package br.edu.fatecpg.cinema

import CinemaDaoImpl
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.edu.fatecpg.cinema.models.Cinema
import br.edu.fatecpg.cinema.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    val dao = CinemaDaoImpl()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val edtFilme = findViewById<EditText>(R.id.edt_filme)
        val edtAutor = findViewById<EditText>(R.id.edt_autor)
        val btnCadastrar = findViewById<Button>(R.id.btn_cadastrar)
        val fabLista = findViewById<FloatingActionButton>(R.id.fab_lista)
        btnCadastrar.setOnClickListener{
            val filme = edtFilme.text.toString()
            val autor = edtAutor.text.toString()
            val cinema = Cinema(filme, autor)
            dao.AdicionarFilme(cinema)
            Toast.makeText(this, "Filme e Autor Cadastrado", Toast.LENGTH_SHORT).show()
            edtFilme.text.clear()
            edtAutor.text.clear()
        }
        fabLista.setOnClickListener {
            val intent = Intent(this,ListaActivity::class.java)
            startActivity(intent)
        }
        }
    }