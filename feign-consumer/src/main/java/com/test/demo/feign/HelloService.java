package com.test.demo.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created on 2017/11/8.
 */
@FeignClient("hello-service/eureka-producer")
public interface HelloService {
	@RequestMapping("/hello")
	String hello();
}
