package cyberjughh;

import java.util.Date;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class PingService {

    public String pingMe() {
        return "cyber is great " + new Date();
    }
    
}
