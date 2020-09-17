package airhacks.service.ping.boundary;

import java.util.Date;

import javax.enterprise.context.ApplicationScoped;

import io.quarkus.scheduler.Scheduled;

@ApplicationScoped
public class JobScheduler {

    @Scheduled(every = "5s")
    public void wakeUpAttendees() {
        System.out.println("JobScheduler.enclosing_method() " + new Date());
    }
    
}
