package entity

data class MunicipioDTO(
    val codigoIBGE: String,
    val nomeIBGE: String,
    val codigoRegiao: String,
    val nomeRegiao: String,
    val pais: String,
    val uf: UFDTO
)
