package com.alialsubhi.learningCRON;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ScheduleClass {

    @Scheduled(cron = "0 0 3 1 * *")
    public void schedule(){
        System.out.println("""
                Write a CRON expression that:
                n that runs a job every month on the first day of the month at 3:00 AM.
                """);
    }
}
