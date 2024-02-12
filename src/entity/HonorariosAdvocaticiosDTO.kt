package entity

import java.util.Date

data class HonorariosAdvocaticiosDTO(
    val mesReferencia: Date,
    val valor: Double,
    val mensagemMesReferencia: String,
    val valorFormatado: String
)
