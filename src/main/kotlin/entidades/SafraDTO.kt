package main.kotlin.entidades

import java.util.Date

data class SafraDTO(
    val id: Int,
    val beneficiarioSafra: BeneficiarioDTO,
    val mesReferencia: Date,
    val municipio: MunicipioDTO,
    val valor: Double
)
