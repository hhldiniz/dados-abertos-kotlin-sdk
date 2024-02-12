package entity

import java.util.Date

data class RubricaDTO(
    val codigo: String,
    val descricao: String,
    val valor: Double,
    val skMesReferencia: Date,
    val valorDolar: Double
)
