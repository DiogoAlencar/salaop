package com.so.salaop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
public class SalaopApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalaopApplication.class, args);
	}
	
	/*
	 * @EntityScan(basePackages="com.so.salaop")
	 * 
	 * @ComponentScan(basePackages= {"com.*"})
	 * 
	 * @EnableJpaRepositories(basePackages= {"com.so.salaop.repository"})
	 * 
	 * @EnableTransactionManagement
	 */

}
