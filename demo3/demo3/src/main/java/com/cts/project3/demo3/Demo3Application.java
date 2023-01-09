package com.cts.project3.demo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo3Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo3Application.class, args);
	}
	
	@GetMapping("/hello")
	
	public String hello(@RequestParam(value = "name", defaultValue = "world" ) String name) {
		return String.format("Hello Nagendar %s!", name);
		
	}

}
