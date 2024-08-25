package br.edu.fatecpg.livraria

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtAutor = findViewById<EditText>(R.id.editAutor)
        val edtLivro = findViewById<EditText>(R.id.editLivro)
        val btn = findViewById<Button>(R.id.btn_cadastrar)

        btn.setOnClickListener{
            val intent = Intent(this,LivroActivity::class.java)
            intent.putExtra("autor", edtAutor.text.toString())
            intent.putExtra("livro", edtLivro.text.toString())
            startActivity(intent)
        }
    }
}