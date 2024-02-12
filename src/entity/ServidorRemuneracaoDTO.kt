package entity

data class ServidorRemuneracaoDTO(
    val servidor: ServidorAposentadoriaPensionistaDTO,
    val remunecacoesDTO: List<RemuneracaoDTO>
)
