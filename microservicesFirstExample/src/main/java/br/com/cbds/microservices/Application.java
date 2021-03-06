package br.com.cbds.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@SpringBootApplication // Tells the Spring Boot that this is the bootstrap class for the project.
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args); // Call to start the entire Spring Boot service
	}
	
	
	@Configuration
	class Config 
	{
		@LoadBalanced
		@Bean
		public RestTemplate restTemplate() 
		{
			return new RestTemplate();
		}
	}
}
