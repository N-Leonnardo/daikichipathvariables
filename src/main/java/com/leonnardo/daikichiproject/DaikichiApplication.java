package com.leonnardo.daikichiproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/daikichi")

public class DaikichiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaikichiApplication.class, args);
		}
	
	@RequestMapping("")
	public String hello() {
		return "Welcome!";
	}
	@RequestMapping("/travel/{place}")
	public String travel(@PathVariable("place") String place)
	{
		return "You will soon travel to "+ place;
	}
	
	
	@RequestMapping("/lotto/{number}")
	public String tomorrow(@PathVariable("number") int number) 
	{
		if(number%2 == 0) {
			return "You will take a grand journey in the near future, but be weary of tempting offers";
		}else {
			return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
			
		}
			
	}
	
}

