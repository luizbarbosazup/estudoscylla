package br.com.iupp.model

import io.micronaut.core.annotation.Introspected
import java.util.*

@Introspected
data class ClientEntity(
    val id:UUID,
    val name:String,
    val email:String,
    val cpf:String
)