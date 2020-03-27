package com.well;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com/well/mapper"})
public class WellApplication {

	public static void main(String[] args) {
		SpringApplication.run(WellApplication.class, args);
	}

}
