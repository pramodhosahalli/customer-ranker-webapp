package com.rank.customerranker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EnableJpaRepositories(basePackages = "com.rank.customerrank.repository")
public class CustomerRankerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerRankerApplication.class, args);
	}

}
