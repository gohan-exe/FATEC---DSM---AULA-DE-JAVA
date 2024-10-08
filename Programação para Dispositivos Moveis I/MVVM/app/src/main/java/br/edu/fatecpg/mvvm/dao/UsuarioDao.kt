package br.edu.fatecpg.mvvm.dao

import br.edu.fatecpg.mvvm.model.Usuario

class UsuarioDao {
    companion object {
        private val usuarios: MutableList<Usuario> = mutableListOf()
    }
    fun cadastro(user: Usuario){
        usuarios.add(user)
    }

    fun consultar():List<Usuario>{
        return usuarios
    }

}