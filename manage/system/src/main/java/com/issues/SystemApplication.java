package com.issues;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.issues.system")
public class SystemApplication {

	public static void main(String args[]) {
		SpringApplication.run(SystemApplication.class, args);
	}

}
