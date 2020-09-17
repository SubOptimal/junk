import com.google.inject.Inject;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class PingResourceClientIT {

    @Inject
    @RestClient
    PingResourceClient resourceClient;

    @Test
    public void message() {
        var message = this.resourceClient.message();
        System.out.println("message " + message);
    }
    
}
