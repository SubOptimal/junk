package airhacks.service.ping.boundary;

import java.util.Date;

import javax.ejb.Schedule;
import javax.ejb.Schedules;
import javax.ejb.Singleton;

@Singleton
public class JobScheduler {

    @Schedule(minute = "*",second = "*/5",hour = "*")
    public void wakeUpAttendees() {
        System.out.println("JobScheduler.enclosing_method() " + new Date());
    }
    
}
