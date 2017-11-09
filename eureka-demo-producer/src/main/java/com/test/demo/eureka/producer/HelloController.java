package com.test.demo.eureka.producer;

import com.test.demo.hello.api.HelloService;
import com.test.demo.hello.api.UserDto;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 2017/9/19.
 */
@RestController
public class HelloController implements HelloService {

	@Override
	public String hello() {
		return "hello-service: success";
	}

	@Override
	public UserDto hello(Long name) {
		UserDto userDto = new UserDto();
		userDto.setId(name);
		return userDto;
	}
}
