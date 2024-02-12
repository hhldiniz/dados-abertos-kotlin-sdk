package entity

data class PessoaDTO(
    val id: Int,
    val cpfFormatado: String,
    val cnpjFormatado: String,
    val numeroInscricaoSocial: String,
    val nome: String,
    val razaoSocialReceita: String,
    val nomeFantasiaReceita: String,
    val tipo: String
)
