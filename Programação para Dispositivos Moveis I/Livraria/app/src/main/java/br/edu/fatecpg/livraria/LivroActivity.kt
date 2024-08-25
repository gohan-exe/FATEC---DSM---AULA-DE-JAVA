package br.edu.fatecpg.livraria

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LivroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_livro)

        val txtA = findViewById<TextView>(R.id.txtAutor)
        val txtT = findViewById<TextView>(R.id.txtTitulo)

        txtA.text = intent.getStringExtra("autor")?:"Nada Encontrado"
        txtT.text = intent.getStringExtra("livro")?:"Nada Encontrado"


    }

    override fun onStart(){
        super.onStart()
        Log.i("Entrou no OnStart",
            intent.getStringExtra("livro")?:"Nada Encontrado")
    }
}

