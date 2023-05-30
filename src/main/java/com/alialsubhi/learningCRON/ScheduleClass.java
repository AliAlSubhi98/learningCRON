package com.alialsubhi.learningCRON;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ScheduleClass {

    @Scheduled(cron = "0 30 14 * * *")
    public void schedule(){
        System.out.println("""
                Write a CRON expression that:
                that runs a job every day at 2:30 PM.
                """);
    }
}
