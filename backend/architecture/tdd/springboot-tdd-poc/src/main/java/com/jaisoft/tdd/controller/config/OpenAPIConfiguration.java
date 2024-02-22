package com.jaisoft.tdd.controller.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                title = "TDD Poc",
                version = "v1",
                description = "Proof on concept over TDD",
                contact = @Contact(name = "Jaime", url = "https://abante.com", email = "jaime.gomez.moraleda@gmail.com"),
                license = @License(name = "MIT Licence", url = "https://github.com/Jaisoft")),
        servers = @Server(url = "http://localhost:8080")
)
class OpenAPIConfiguration {
}

