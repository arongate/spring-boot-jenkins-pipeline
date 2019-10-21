package com.eddypepy.ci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class SpringBootJenkinsPipelineApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJenkinsPipelineApplication.class, args);
	}

}
