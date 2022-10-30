package io.mklabs.dtos.responses

import io.micronaut.core.annotation.Introspected

@Introspected
data class ServersListDto(val servers: List<String> = emptyList(),
                          val meta: MetaHeaderDto = MetaHeaderDto(pagination = PaginationDto())
)
