package entity

import java.util.Date

data class BeneficioPorMunicipioDTO(
    val id: Int,
    val dataReferencia: Date,
    val municipio: MunicipioDTO,
    val tipo: TipoBeneficioDTO,
    val valor: Double,
    val quantidadeBeneficiados: Int
)
