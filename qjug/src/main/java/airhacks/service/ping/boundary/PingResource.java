package airhacks.service.ping.boundary;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.eclipse.microprofile.metrics.annotation.Metered;

import airhacks.service.Boundary;

@Boundary
@Path("ping")
public class PingResource {

    @Inject
    Messenger messenger;

    @GET
    @Metered
    public String ping() {
        return this.messenger.message() + " Jakarta EE 8 with MicroProfile 3+!";
    }

}
