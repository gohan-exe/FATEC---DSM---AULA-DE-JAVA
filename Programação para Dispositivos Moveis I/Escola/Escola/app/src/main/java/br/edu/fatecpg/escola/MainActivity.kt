package br.edu.fatecpg.escola

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextNome: EditText = findViewById(R.id.editTextNome)
        val buttonAvancar: Button = findViewById(R.id.buttonAvancar)

        buttonAvancar.setOnClickListener {
            val nome = editTextNome.text.toString()
            val intent = Intent(this, SegundaActivity::class.java)
            intent.putExtra("NOME_ALUNO", nome)
            startActivity(intent)
        }
    }
}
