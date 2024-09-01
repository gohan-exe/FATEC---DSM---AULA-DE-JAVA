package br.edu.fatecpg.viacep.ui

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.edu.fatecpg.viacep.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextCep = findViewById<EditText>(R.id.editTextCep)
        val fabPesquisar = findViewById<FloatingActionButton>(R.id.fabPesquisar)

        fabPesquisar.setOnClickListener {
            val cep = editTextCep.text.toString()
            if (cep.isNotEmpty()) {
                val intent = Intent(this, ResultadoActivity::class.java)
                intent.putExtra("CEP", cep)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Digite um CEP válido", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
