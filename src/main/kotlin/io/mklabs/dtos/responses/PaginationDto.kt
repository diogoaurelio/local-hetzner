package io.mklabs.dtos.responses

data class PaginationDto(
    val page: Int = 1,
    val per_page: Int = 25,
    val previous_page: Int? = null,
    val next_page: Int? = null,
    val last_page: Int = 1,
    val total_entries: Int = 0
)
