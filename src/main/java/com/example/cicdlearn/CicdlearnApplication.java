package com.example.cicdlearn;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
@RestController
public class CicdlearnApplication {
	
	@Autowired
	ObjectMapper objectMapper;

	public static void main(String[] args) {
		SpringApplication.run(CicdlearnApplication.class, args);
	}
	
	@GetMapping("/hello")
	public String hello() throws JsonProcessingException {
		return objectMapper.writeValueAsString("Hello, World @ "+new Date(System.currentTimeMillis()));
	}
}
