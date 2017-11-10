package com.test.demo.hello.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *	使用示例，添加如下接口
 * 	//@FeignClient(Const.Hello_Service_Prefix)
 *	public interface HelloServiceClient extends HelloService {
 *	}
 * Created on 2017/11/8.
 */
public interface HelloService {
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	String hello();

	@RequestMapping(value = "/helloId", method = RequestMethod.GET)
	UserDto hello(@RequestParam(name = "name", required = false) Long name);
}
