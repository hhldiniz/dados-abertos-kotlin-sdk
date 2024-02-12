package entity

data class OrgaoServidorDTO(
    val codigo: String,
    val nome: String,
    val sigla: String,
    val codigoOrgaoVinculado: String,
    val nomeOrgaoVinculado: String
)
