package com.speezy.fastcommers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@EntityScan("com.speezy.fastcommers.entity")
public class SpeezzyBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpeezzyBackendApplication.class, args);
		System.out.println(("Hello World!"));
		System.out.println("database connected and working perfectly fine with this ok	");

	}

}
