package com.leandrogugiato.Prestmos;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class PrestmosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrestmosApplication.class, args);
	}

}
