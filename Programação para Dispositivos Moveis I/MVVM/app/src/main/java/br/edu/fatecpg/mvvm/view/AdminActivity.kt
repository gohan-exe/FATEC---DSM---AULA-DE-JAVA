// AdminActivity.kt
package br.edu.fatecpg.mvvm.view

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.edu.fatecpg.mvvm.R
import br.edu.fatecpg.mvvm.viewmodel.LoginViewModel
import br.edu.fatecpg.mvvm.adapter.UsuarioAdapter

class AdminActivity : AppCompatActivity() {
    private val viewModel: LoginViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerViewUsuarios)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val usuarios = viewModel.getUsuarios()
        val adapter = UsuarioAdapter(usuarios)
        recyclerView.adapter = adapter
    }
}
