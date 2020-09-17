import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("ping")
@RegisterRestClient(configKey ="qjug")
public @interface PingResourceClient {
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    String message();
}
