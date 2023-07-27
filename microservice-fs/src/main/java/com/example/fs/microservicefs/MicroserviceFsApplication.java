package com.example.fs.microservicefs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviceFsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceFsApplication.class, args);
	}

}
