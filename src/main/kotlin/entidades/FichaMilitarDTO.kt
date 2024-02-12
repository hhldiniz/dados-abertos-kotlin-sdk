package main.kotlin.entidades

data class FichaMilitarDTO(
    val nome: String,
    val cpfDescaracterizado: String,
    val matriculaDescaracterizada: String,
    val dataPublicacaoDocumentoIngressoServicoPublico: String,
    val diplomaLegal: String,
    val jornadaTrabalho: String,
    val regimeJuridico: String,
    val situacaoServidor: String,
    val afastamentos: List<String>,
    val orgaoSuperior: String,
    val orgao: String,
    val orgaoServidorLotacao: String,
    val cargo: String,
    val dataIngressoOrgao: String
)
