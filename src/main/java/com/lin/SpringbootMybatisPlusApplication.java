package com.lin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
public class SpringbootMybatisPlusApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybatisPlusApplication.class, args);
	}
}
