package com.test.demo.feign;

import com.test.demo.hello.api.HelloService;
import com.test.demo.hello.api.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 2017/11/8.
 */
@RestController
public class ConsumerController {

	@Autowired
	HelloService helloService;

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String helloConsumer() {
		return helloService.hello();
	}

	@RequestMapping(value = "/helloId", method = RequestMethod.GET)
	public UserDto helloConsumerId() {
		return helloService.hello(1L);
	}
}
