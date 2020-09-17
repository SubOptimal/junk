package cyberjughh;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UnusedService {

    public void hello() {
        System.out.println("Unused.hello()");
    }
    
}
