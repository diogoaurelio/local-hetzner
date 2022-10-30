package io.mklabs.controllers

import io.micronaut.http.HttpRequest
import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import io.mklabs.Routes
import io.mklabs.dtos.responses.MetaHeaderDto
import io.mklabs.dtos.responses.PaginationDto
import io.mklabs.dtos.responses.ServersListDto
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import jakarta.inject.Inject

@MicronautTest
internal class ServersControllerTest {

    @Inject
    @field:Client("/")
    lateinit var client: HttpClient


    @Test
    fun listServers_should_returnEmptyResponse() {

        val request: HttpRequest<Any> = HttpRequest
            .GET<Any?>(Routes.listServers)

        val body = client.toBlocking()
            .retrieve(request, ServersListDto::class.java)
        assertNotNull(body)
        assertNotNull(body.servers)
        assertEquals(listOf<String>(), body.servers)
        assertNotNull(body.meta)
        assertEquals(MetaHeaderDto(pagination = PaginationDto()), body.meta)
    }
}