package entity

data class ServidorPorOrgaoDTO(
    val qntPessoas: Int,
    val qntVinculos: Int,
    val skSituacao: Int,
    val descSituacao: String,
    val skTipoVinculo: Int,
    val descTipoVinculo: String,
    val skTipoServidor: Int,
    val descTipoServidor: String,
    val licenca: Int,
    val codOrgaoExercicioSiape: String,
    val nomOrgaoExercicioSiape: String,
    val codOrgaoSuperiorExercicioSiape: String,
    val nomOrgaoSuperiorExercicioSiape: String,
)
