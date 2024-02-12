package main.kotlin.entidades

data class ServidorAposentadoriaPensionistaDTO(
    val id: Int,
    val idPessoaAposentadoriaPensionista: Int,
    val pessoa: PessoaDTO,
    val situacao: String,
    val orgaoServidorLotacao: OrgaoServidorDTO,
    val orgaoServidorExercicio: OrgaoServidorDTO,
    val estadoExercicio: UFDTO,
    val tipoServidor: String,
    val funcao: FuncaoServidorDTO,
    val servidorInativoInstuidorPensao: ServidorInativoDTO,
    val pensionistaRepresentante: PensionistaRepresentanteDTO,
    val codigoMatriculaFormatado: String,
    val flagAfastado: Int
)
