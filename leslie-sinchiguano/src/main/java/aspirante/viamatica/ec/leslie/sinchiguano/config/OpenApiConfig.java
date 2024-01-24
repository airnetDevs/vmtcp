package aspirante.viamatica.ec.leslie.sinchiguano.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
    info = @Info(
        contact = @Contact(
            name = "Lemmar",
            email = "lesliesinchiguano@gmail.com"
        ),
        description = "SGG",
        title = "Control de Garaje Spring Boot v3.1.2",
        version = "0.0.1"
    ),
    servers = {
        @Server(
            description = "Desarrollo local",
            url = "http://localhost:8080"
        )
    }
)
public class OpenApiConfig {
}
