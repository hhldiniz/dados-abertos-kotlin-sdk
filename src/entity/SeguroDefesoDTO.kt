package entity

import java.util.Date

data class SeguroDefesoDTO(
    val id: Int,
    val pessoaSeguroDefeso: BeneficiarioDTO,
    val municipio: MunicipioDTO,
    val portaria: String,
    val dataMesReferencia: Date,
    val dataSaque: Date,
    val dataEmissaoParcela: Date,
    val situacao: String,
    val rgp: String,
    val parcela: String,
    val valor: Double
)
