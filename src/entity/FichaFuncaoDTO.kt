package entity

data class FichaFuncaoDTO(
    val nome: String,
    val cpfDescaracterizado: String,
    val matriculaDescaracterizada: String,
    val dataPublicacaoDocumentoIngressoServicoPublico: String,
    val diplomaLegal: String,
    val jornadaTrabalho: String,
    val regimeJuridico: String,
    val situacaoServidor: String,
    val afastamentos: List<String>,
    val orgaoSuperiorLotacao: String,
    val orgaoLotacao: String,
    val uorgLotacao: String,
    val orgaoServidorLotacao: String,
    val dataIngressoOrgao: String,
    val dataIngressoServicoPublico: String,
    val orgaoSuperiorExercicio: String,
    val orgaoExercicio: String,
    val uorgExercicio: String,
    val orgaoServidorExercicio: String,
    val funcao: String,
    val atividade: String,
    val opcaoFuncao: String,
    val dataIngressoFuncao: String,
    val ufExercicio: String
)
