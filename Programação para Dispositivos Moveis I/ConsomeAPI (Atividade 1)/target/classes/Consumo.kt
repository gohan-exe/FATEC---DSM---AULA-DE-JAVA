package br.edu.fatecpg

import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse.BodyHandlers
import com.google.gson.Gson

class Consumo {
    fun buscaEndereco(cep: String): Endereco {
        val client: HttpClient = HttpClient.newHttpClient()
        val request = HttpRequest.newBuilder()
            .uri(URI.create("https://viacep.com.br/ws/$cep/json/"))
            .build()
        val response = client.send(request, BodyHandlers.ofString())
        val jsonResponse = response.body()
        
        return Gson().fromJson(jsonResponse, Endereco::class.java)
    }
}