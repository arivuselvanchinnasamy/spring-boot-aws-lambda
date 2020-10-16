package com.arivu.aws.lambda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application.properties")
public class SpringBootAwsLambdaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAwsLambdaApplication.class, args);
	}

}
