package com.test.demo.eureka;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * eureka访问地址： http://127.0.0.1:9999/eureka-demo
 * Created on 2017/9/19.
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {
	public static void main(String[] args) {
		new SpringApplicationBuilder(EurekaApplication.class).web(true).run(args);
	}
}
