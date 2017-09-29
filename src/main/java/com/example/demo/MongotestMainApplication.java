package com.example.demo;

import org.jsondoc.spring.boot.starter.EnableJSONDoc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
@EnableJSONDoc
public class MongotestMainApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongotestMainApplication.class, args);
	}
}
