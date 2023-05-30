package com.alialsubhi.learningCRON;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ScheduleClass {

    @Scheduled(cron = "0 0 8 * * 1")
    public void schedule(){
        System.out.println("""
                Write a CRON expression that:
                that runs a job every Monday at 8:00 AM.
                """);
    }
}
