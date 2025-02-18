package com.example.auction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.util.Scanner;

@SpringBootApplication
public class AuctionApplication {

	public static void main(String[] args) {
		// Prompt user for database credentials before starting Spring Boot
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter database username: ");
		String dbUser = scanner.nextLine();

		System.out.print("Enter database password: ");
		String dbPassword = scanner.nextLine();

		// Store in system properties (accessible anywhere in the app)
		System.setProperty("DB_USERNAME", dbUser);
		System.setProperty("DB_PASSWORD", dbPassword);

		SpringApplication.run(AuctionApplication.class, args);
	}

	@Bean
	public DataSource dataSource() {
		String dbUser = System.getProperty("DB_USERNAME");
		String dbPassword = System.getProperty("DB_PASSWORD");

		if (dbUser == null || dbPassword == null) {
			throw new IllegalStateException("Database credentials are not set. Restart the application.");
		}

		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://localhost:5432/auction_db");
		dataSource.setUsername(dbUser);
		dataSource.setPassword(dbPassword);

		return dataSource;
	}
}
