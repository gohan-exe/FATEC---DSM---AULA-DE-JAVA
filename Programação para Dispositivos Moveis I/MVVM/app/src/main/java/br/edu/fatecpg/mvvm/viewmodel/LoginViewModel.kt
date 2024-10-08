package br.edu.fatecpg.mvvm.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import br.edu.fatecpg.mvvm.dao.UsuarioDao
import br.edu.fatecpg.mvvm.model.Usuario

class LoginViewModel : ViewModel() {
    private val dao = UsuarioDao()
    private var tentativas = mutableMapOf<String, Int>()

    fun logar(user: Usuario): String {
        val usuarioCadastrado = dao.consultar().find { it.login == user.login }

        return when {
            usuarioCadastrado == null -> "Login Inválido!"
            usuarioCadastrado.bloq -> "Usuário bloqueado!"
            usuarioCadastrado.senha == user.senha -> {
                tentativas.remove(user.login)
                Log.i("user", usuarioCadastrado.toString())
                "Login Realizado Com Sucesso!"
            }
            else -> {
                val tentativasUsuario = tentativas.getOrDefault(user.login, 0) + 1
                tentativas[user.login] = tentativasUsuario

                if (tentativasUsuario >= 4) {
                    usuarioCadastrado.bloq = true
                    return "Usuário bloqueado após 4 tentativas!"
                }
                "Senha Inválida! Tentativas: $tentativasUsuario"
            }
        }
    }

    fun cadastrar(user: Usuario): String {
        val usuarioExistente = dao.consultar().find { it.login == user.login }
        return if (usuarioExistente != null) {
            "Você já é cadastrado"
        } else {
            dao.cadastro(user)
            "Cadastrado Com Sucesso!"
        }
    }

    fun getUsuarios(): List<Usuario> {
        return dao.consultar()
    }
}
