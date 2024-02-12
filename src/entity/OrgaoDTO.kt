package entity

data class OrgaoDTO(
    val nome: String,
    val codigoSIAFI: String,
    val cnpj: String,
    val sigla: String,
    val descricaoPoder: String,
    val orgaoMaximo: OrgaoMaximoDTO
)
