package entity

data class EmpresaImuneIsentaDTO(
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
    val tipoEntidade: String,
    val beneficioFiscal: String,
)