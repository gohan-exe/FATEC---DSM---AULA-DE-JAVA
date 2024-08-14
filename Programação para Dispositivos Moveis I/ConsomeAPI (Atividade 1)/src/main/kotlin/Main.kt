package br.edu.fatecpg

import com.google.gson.Gson
import java.util.Scanner

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val scanner = Scanner(System.`in`)
    println("Digite o CEP para consulta:")
    val cep = scanner.nextLine()

    val consumo = Consumo()
    val endereco = consumo.buscaEndereco(cep)
    
    println(endereco)
}