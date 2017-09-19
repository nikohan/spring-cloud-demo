package com.test.demo.eureka.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created on 2017/9/19.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ProducerEurekaApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProducerEurekaApplication.class, args);
	}
}
