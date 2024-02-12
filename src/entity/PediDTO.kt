package entity

import java.util.*

data class PediDTO(
    val id: Int,
    val beneficiarioPeti: BeneficiarioDTO,
    val dataDisponibilizacaoRecurso: Date,
    val dataMesReferencia: Date,
    val municipio: MunicipioDTO,
    val situacao: String,
    val valor: Double
)
