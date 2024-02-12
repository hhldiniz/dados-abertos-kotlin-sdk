package main.kotlin.entidades

data class ServidorRemuneracaoDTO(
    val servidor: ServidorAposentadoriaPensionistaDTO,
    val remunecacoesDTO: List<RemuneracaoDTO>
)
