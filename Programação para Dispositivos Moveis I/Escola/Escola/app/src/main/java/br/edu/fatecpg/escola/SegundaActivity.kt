package br.edu.fatecpg.escola

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class SegundaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        val textViewNome: TextView = findViewById(R.id.textViewNome)
        val textViewMatricula: TextView = findViewById(R.id.textViewMatricula)
        val buttonGerarMatricula: Button = findViewById(R.id.buttonGerarMatricula)

        val nomeAluno = intent.getStringExtra("NOME_ALUNO")
        textViewNome.text = "Nome: $nomeAluno"

        buttonGerarMatricula.setOnClickListener {
            val numeroMatricula = Random.nextInt(100000, 999999)
            textViewMatricula.text = "Matrícula: $numeroMatricula"
        }
    }
}