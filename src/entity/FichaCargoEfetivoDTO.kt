package entity

data class FichaCargoEfetivoDTO(
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
    val orgaoServidorExercicio: String,
    val uorgExercicio: String,
    val cargo: String,
    val classeCargo: String,
    val padraoCargo: String,
    val nivelCargo: String,
    val dataIngressoCargo: String,
    val formaIngresso: String,
    val ufExercicio: String,
)
