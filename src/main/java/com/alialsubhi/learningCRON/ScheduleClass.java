package com.alialsubhi.learningCRON;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ScheduleClass {

    @Scheduled(cron = "*/5 * * * * *")
    public void schedule(){
        System.out.println("Job executed at: " + new Date());
    }
}
