package main.kotlin.entidades

data class FichaServidorCivilDTO(
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
)
