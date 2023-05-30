package com.alialsubhi.learningCRON;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ScheduleClass {
/*Second      Minute        Hour       Day      Month       Day of Week
  0-59        0-59          0-23       1-31     1-12        0-6  {0-> Sunday}*/
    @Scheduled(cron = "0 0 * * 1 *")
    public void schedule(){
        System.out.println("""
                Write a CRON expression that:
                that runs a job every hour during the month of January.
                 """);
    }
}
