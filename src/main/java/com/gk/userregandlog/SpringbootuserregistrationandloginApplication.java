package com.gk.userregandlog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class SpringbootuserregistrationandloginApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootuserregistrationandloginApplication.class, args);
	}

}
