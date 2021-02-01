package com.ensa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class JenkinsDockerIntegrationApplication {

	 @RequestMapping("/")
	  public String home() {
	    return "Hello Docker World";
	    
	  }
	public static void main(String[] args) {
		SpringApplication.run(JenkinsDockerIntegrationApplication.class, args);
	}

}
