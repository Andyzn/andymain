package com.andy.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Spring Boot 应用程序入口
 */
@SpringBootApplication
public class MainApplication{

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}
}
