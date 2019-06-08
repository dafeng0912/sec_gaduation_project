package com.dafeng.sec.configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * 	设置CORS（跨域资源共享）
 * 	**********协议 + 域名 + 端口**************
 * CORS需要浏览器和服务器同时支持。它的通信过程，都是浏览器自动完成，不需要用户参与。
 *	对于开发者来说，CORS通信与同源的AJAX通信没有差别，代码完全一样。浏览器一旦发现AJAX请求跨源，就会自动添加一些附加的头信息，有时还会多出一次附加的请求，但用户不会有感觉。
 *	因此，实现CORS通信的关键是服务器。只要服务器实现了CORS接口，就可以跨源通信。
 * 	利用@Configuration用于定义配置类来替换xml配置文件，被AnnotationConfigApplicationContext扫描构建bean，初始化Spring容器
 * @author 大风
 *
 */
@Configuration
public class GateWayCorsConfig
{
	/**
	 * 	使用Filter 处理跨域请求，即CORS（跨来源资源共享）。
	 * @return
	 */
	 private CorsConfiguration buildConfig() {  
//		          用于CORS配置的容器以及检查给定请求的实际来源，HTTP方法和标头的方法
	        CorsConfiguration corsConfiguration = new CorsConfiguration();  
//	      	 是否支持安全证书
	        corsConfiguration.setAllowCredentials(true);  
//			容许跨域访问的域名格式
	        corsConfiguration.addAllowedOrigin("*");
//	       	 请求头	        
	        corsConfiguration.addAllowedHeader(CorsConfiguration.ALL); // 2
//	      	请求方法
	        corsConfiguration.addAllowedMethod(CorsConfiguration.ALL); // 3
	        return corsConfiguration;  
	    }  
	  
//		 设置跨域请求，处理跨域请求
	    @Bean  
	    public CorsFilter corsFilter() {  
	        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();  
	        source.registerCorsConfiguration("/**", buildConfig()); // 4  
//	       	 注册CORS过滤器
	        return new CorsFilter(source);  
	    }  
}
 