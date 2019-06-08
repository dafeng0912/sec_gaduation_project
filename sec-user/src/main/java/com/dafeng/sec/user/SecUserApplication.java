package com.dafeng.sec.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ServletComponentScan
@Configuration
@EnableAutoConfiguration
@EnableEurekaClient
@EnableDiscoveryClient
@MapperScan("com.dafeng.sec.user.domain.*.repo.dao.**")
public class SecUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecUserApplication.class, args);
		System.out.println("--------------------用户管理模块启动---------------------");
	}

}
