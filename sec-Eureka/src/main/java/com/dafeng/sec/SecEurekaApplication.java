package com.dafeng.sec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SecEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecEurekaApplication.class, args);
		System.out.println("------------注册服务启动--------------");
	}

}
