package main.kotlin.entidades

import java.util.Date

data class PermissionarioDTO(
    val id: Int,
    val dataInicioOcupacao: Date,
    val pessoaPermissionario: PessoaDTO,
    val orgaoPermissionario: OrgaoDTO,
    val cargo: String,
    val valorPagoMes: Double
)
