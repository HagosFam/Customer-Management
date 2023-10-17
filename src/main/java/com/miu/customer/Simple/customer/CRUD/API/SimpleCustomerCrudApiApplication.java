package com.miu.customer.Simple.customer.CRUD.API;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleCustomerCrudApiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SimpleCustomerCrudApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Application running successfully");
	}
}
