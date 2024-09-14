package br.edu.fatecpg.tarefa.dao

data class Tarefa(
    val nome: String,
    val descricao: String,
    var concluida: Boolean = false
)