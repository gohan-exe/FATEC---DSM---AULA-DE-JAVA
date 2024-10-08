package br.edu.fatecpg.mvvm.view

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import br.edu.fatecpg.mvvm.databinding.ActivityLoginBinding
import br.edu.fatecpg.mvvm.model.Usuario
import br.edu.fatecpg.mvvm.viewmodel.LoginViewModel

class LoginActivity : AppCompatActivity() {
    private val viewModel: LoginViewModel by viewModels()
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnEntrar.setOnClickListener {
            val user = getUserFromInput()
            val retorno = viewModel.logar(user)
            Toast.makeText(this, retorno, Toast.LENGTH_SHORT).show()
        }

        binding.btnCad.setOnClickListener {
            val user = getUserFromInput()
            val retorno = viewModel.cadastrar(user)
            Toast.makeText(this, retorno, Toast.LENGTH_SHORT).show()
        }

        binding.fabAdmin.setOnClickListener {
            val intent = Intent(this, AdminActivity::class.java)
            startActivity(intent)
        }
    }

    private fun getUserFromInput(): Usuario {
        val login = binding.edtLogin.text.toString()
        val senha = binding.edtSenha.text.toString()
        return Usuario(login, senha, bloq = false)
    }


}
