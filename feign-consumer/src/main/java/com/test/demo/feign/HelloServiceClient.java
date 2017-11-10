package com.test.demo.feign;

import com.test.demo.hello.api.Const;
import com.test.demo.hello.api.HelloService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Created on 2017/11/8.
 */
@FeignClient(Const.Hello_Service_Prefix)
public interface HelloServiceClient extends HelloService {
}
