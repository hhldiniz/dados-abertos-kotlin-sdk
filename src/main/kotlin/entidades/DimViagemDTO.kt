package main.kotlin.entidades

data class DimViagemDTO(
    val motivo: String,
    val pcdp: String,
    val ano: Int,
    val numPcdp: String,
    val justificativaUrgente: String,
    val urgenciaViagem: String
)
