package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.EurekaClient;


@RestController
@EnableEurekaClient
@SpringBootApplication
public class EurekaClientDemo1Application {

	private static EurekaClient eurekaClient;
	
	@RequestMapping("/") 
	String home() {
	    return "This is a Demo project";
	}
	
	@RequestMapping("/hello") 
	String home1() {
	    return "This is a Demo project for hello mapping request";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(EurekaClientDemo1Application.class, args);
	}
	
	
	
	
}



