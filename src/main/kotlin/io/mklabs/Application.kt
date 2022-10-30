package io.mklabs

import io.micronaut.runtime.Micronaut.*
import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.info.*

@OpenAPIDefinition(
        info = Info(
                title = "local-hetzner",
                version = "0.0"
        )
)
object Api {
}

fun main(args: Array<String>) {
    run(*args)
}

