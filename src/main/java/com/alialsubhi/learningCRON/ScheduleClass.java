package com.alialsubhi.learningCRON;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ScheduleClass {

    @Scheduled(cron = "0 */5 * * * *")
    public void schedule(){
        System.out.println("""
                Write a CRON expression that:
                runs a job every five minutes.
                """);
    }
}
