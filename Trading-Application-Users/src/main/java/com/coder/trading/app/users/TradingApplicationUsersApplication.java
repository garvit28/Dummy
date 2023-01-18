package com.coder.trading.app.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TradingApplicationUsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(TradingApplicationUsersApplication.class, args);
	}

}
