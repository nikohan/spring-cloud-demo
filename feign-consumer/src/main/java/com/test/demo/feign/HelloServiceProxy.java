package com.test.demo.feign;

import com.test.demo.hello.api.HelloService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Created on 2017/11/8.
 */
@FeignClient(value = "hello-service/eureka-producer")
public interface HelloServiceProxy extends HelloService {
}
