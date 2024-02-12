package entity

data class EmpresaHabilitadaBeneficioFiscalDTO(
    val fruicaoVigente: String,
    val dataInicioFruicao: String,
    val dataFimFruicao: String,
    val cnpj: String,
    val beneficiario: String,
    val nomeFantasia: String,
    val uf: String,
    val codigoIBGEMunicipio: String,
    val municipio: String,
    val cnaeCodigoGrupo: String,
    val cnaeCodigoClasse: String,
    val cnaeCodigoSubClasse: String,
    val cnaeNomeClasse: String,
    val cnaeDivisao: String,
    val beneficioFiscal: String,
    val descricao: String,
    val fundamentoLegal: String,
)
