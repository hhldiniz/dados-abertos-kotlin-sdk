package main.kotlin.entidades

import java.util.Date

data class ViagemDTO(
    val id: Int,
    val viagem: DimViagemDTO,
    val situacao: String,
    val beneficiario: BeneficiarioDTO,
    val cargo: CargoBeneficiarioDTO,
    val funcao: FuncaoBeneficiarioDTO,
    val tipoViagem: String,
    val orgao: OrgaoDTO,
    val orgaoPagamento: OrgaoDTO,
    val unidadeGestoraResponsavel: UnidadeGestoraDTO,
    val dataInicioAfastamento: Date,
    val dataFimAfastamento: Date,
    val valorTotalRestituicao: Double,
    val valorTotalTaxaAgenciamento: Double,
    val valorMulta: Double,
    val valorTotalDiarias: Double,
    val valorTotalPassagem: Double,
    val valorTotalViagem: Double,
    val valorTotalDevolucao: Double
)
