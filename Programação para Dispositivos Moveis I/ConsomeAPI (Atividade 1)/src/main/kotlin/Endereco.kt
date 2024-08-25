package br.edu.fatecpg

import com.google.gson.annotations.SerializedName

data class Endereco(@SerializedName("cep") val cep:String,
                    @SerializedName("logradouro") val rua:String,
                    @SerializedName("bairro") val bairro:String,
                    @SerializedName("localidade") val cidade:String)
