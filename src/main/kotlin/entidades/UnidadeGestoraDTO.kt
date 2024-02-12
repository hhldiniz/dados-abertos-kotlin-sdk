package main.kotlin.entidades

data class UnidadeGestoraDTO(
    val codigo: String,
    val nome: String,
    val descricaoPoder: String,
    val orgaoVinculado: OrgaoVinculadoDTO,
    val orgaoMaximo: OrgaoMaximoDTO
)
