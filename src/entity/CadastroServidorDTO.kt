package entity

data class CadastroServidorDTO(
    val servidor: ServidorAposentadoriaPensionistaDTO,
    val fichasCargoEfetivo: List<FichaCargoEfetivoDTO>,
    val fichasFuncao: List<FichaFuncaoDTO>,
    val fichasMilitar: List<FichaMilitarDTO>,
    val fichasDemaisSituacoes: List<FichaServidorCivilDTO>
)
