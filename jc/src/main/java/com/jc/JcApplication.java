package com.jc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.jc.mapper")
@EnableSwagger2
public class JcApplication {

	public static void main(String[] args) {
		SpringApplication.run(JcApplication.class, args);
	}
}
