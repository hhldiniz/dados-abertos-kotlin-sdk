package entity

data class RenunciaDTO(
    val ano: Int,
    val valorRenunciado: Double,
    val tipoRenuncia: String,
    val descricaoBeneficioFiscal: String,
    val descricaoFundamentoLegal: String,
    val tributo: String,
    val formaTributacao: String,
    val cnpj: String,
    val razaoSocial: String,
    val nomeFantasia: String,
    val cnaeCodigoGrupo: String,
    val cnaeCodigoClasse: String,
    val cnaeCodigoSubClasse: String,
    val cnaeNomeClasse: String,
    val cnaeDivisao: String,
    val uf: String,
    val municipio: String,
    val codigoIBGE: String,
)
