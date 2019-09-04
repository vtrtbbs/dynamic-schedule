package com.badilong.dynamicschedule;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(basePackages = "com.badilong.dynamicschedule.dao")
@SpringBootApplication
public class DynamicScheduleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DynamicScheduleApplication.class, args);
	}

}
