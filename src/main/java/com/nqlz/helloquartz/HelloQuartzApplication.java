package com.nqlz.helloquartz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class HelloQuartzApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloQuartzApplication.class, args);
	}

}
