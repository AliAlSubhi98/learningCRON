package com.alialsubhi.learningCRON;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class LearningCronApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningCronApplication.class, args);
	}

}
