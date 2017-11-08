package com.test.demo.feign;

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
}
