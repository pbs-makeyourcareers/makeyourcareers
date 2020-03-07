package com.pbs.jobtutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class JobTutorialApplication extends SpringBootServletInitializer {

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(JobTutorialApplication.class);
    }
	
	public static void main(String[] args) {
		System.out.println("program run..");
		SpringApplication.run(JobTutorialApplication.class, args);
	}

}
