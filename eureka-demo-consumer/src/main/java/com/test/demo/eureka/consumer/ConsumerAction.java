package com.test.demo.eureka.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created on 2017/9/20.
 */
@RestController
public class ConsumerAction {

	@Autowired
	RestTemplate restTemplate;

	@RequestMapping(value = "ribbon-consumer", method = RequestMethod.GET)
	public String hello() {
		String url = "http://hello-service/hello";
		return restTemplate.getForEntity(url, String.class).getBody();
	}
}
