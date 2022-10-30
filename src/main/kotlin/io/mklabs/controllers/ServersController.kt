package io.mklabs.controllers

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.mklabs.Routes
import io.mklabs.dtos.responses.ServersListDto

@Controller(Routes.listServers)
class ServersController {

    @Get(uri = "/", produces = [MediaType.APPLICATION_JSON])
    fun index(): ServersListDto {
        return ServersListDto(servers = emptyList())
    }
}