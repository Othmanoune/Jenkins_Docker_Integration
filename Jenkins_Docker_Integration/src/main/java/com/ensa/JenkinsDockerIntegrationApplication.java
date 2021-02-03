package com.ensa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
//@ComponentScan({"com.ensa.entities","com.ensa","com.ensa.repositories"})
//@EntityScan("com.ensa.entities")
@EnableJpaRepositories
public class JenkinsDockerIntegrationApplication  {

		public static void main(String[] args) {
		SpringApplication.run(JenkinsDockerIntegrationApplication.class, args);
	}

}
