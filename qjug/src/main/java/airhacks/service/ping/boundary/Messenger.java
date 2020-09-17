package airhacks.service.ping.boundary;

import java.util.Date;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@Dependent
public class Messenger {
    
    @Inject
    @ConfigProperty(name = "message")
    String message;    

    public String message() {
        return "hello cyber HH hackers " + new Date();
    }
}
