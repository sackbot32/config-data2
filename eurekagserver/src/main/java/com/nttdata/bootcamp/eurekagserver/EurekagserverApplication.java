package com.nttdata.bootcamp.eurekagserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekagserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekagserverApplication.class, args);
	}

}
