package br.edu.fatecpg.tarefa.ui

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.edu.fatecpg.tarefa.R
import br.edu.fatecpg.tarefa.adapter.TarefaAdapter
import br.edu.fatecpg.tarefa.dao.Tarefa

class MainActivity : AppCompatActivity() {

    private lateinit var tarefaAdapter: TarefaAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var etTaskName: EditText
    private lateinit var etTaskDescription: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etTaskName = findViewById(R.id.etTaskName)
        etTaskDescription = findViewById(R.id.etTaskDescription)
        val btnAddTask = findViewById<Button>(R.id.btnAddTask)
        recyclerView = findViewById(R.id.recyclerView)

        tarefaAdapter = TarefaAdapter(mutableListOf())
        recyclerView.adapter = tarefaAdapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        btnAddTask.setOnClickListener {
            val nome = etTaskName.text.toString()
            val descricao = etTaskDescription.text.toString()

            if (nome.isNotEmpty() && descricao.isNotEmpty()) {
                val tarefa = Tarefa(nome, descricao)
                tarefaAdapter.adicionarTarefa(tarefa)
                etTaskName.text.clear()
                etTaskDescription.text.clear()
            }
        }
    }
}
