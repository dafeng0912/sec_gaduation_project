package com.dafeng.sec.circuit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication	//一个复合注解，启动注解
@ServletComponentScan	//没配置@ComponentScan的情况下，默认只扫描和主类处于同包下的Class。
@Configuration			//用于定义配置类，可替换xml配置文件
@EnableAutoConfiguration  //自动装配
@EnableEurekaClient		//单一，只能eureka客户端注册，都是能够让注册中心能够发现，扫描到改服务
@EnableDiscoveryClient	//其他客户端。都是能够让注册中心能够发现，扫描到改服务
@MapperScan("com.dafeng.sec.circuit.domain.*.repo.dao.**")//指定要扫描的Mapper类的包的路径
public class SecCircuitApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecCircuitApplication.class, args);
		System.out.println("-------------------------------------------");
	}

}
