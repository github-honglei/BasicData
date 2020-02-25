package net.xdclass.demo.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.SpringApplication;

//@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class runApplication {

	public static void main(String[] args) {
		SpringApplication.run(runApplication.class, args);
	}
}
