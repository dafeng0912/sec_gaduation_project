package com.dafeng.sec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 	***利用@EnableZuulProxy来启用路由代理
 *  其默认添加@EnableCircuitBreaker和@EnableDiscoveryClient俩个注解
 * @author 大风
 *
 */
@SpringBootApplication
@EnableZuulProxy
public class SecGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecGatewayApplication.class, args);
		System.out.println("----------------网关开启--------------------");
	}

}
