package com.alialsubhi.learningCRON;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ScheduleClass {
/*Second      Minute        Hour       Day      Month       Day of Week
  0-59        0-59          0-23       1-31     1-12        0-6  {0-> Sunday}*/
    @Scheduled(cron = "0 0 9-17 * * 0-4")
    public void schedule(){
        System.out.println("""
                Write a CRON expression that:
                  that runs a job every hour on weekdays between 9:00 AM and 5:00 PM.
                """);
    }
}
