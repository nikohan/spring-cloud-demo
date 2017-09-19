package com.test.demo.eureka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 2017/9/19.
 */
@RestController
public class HelloController {

	@Autowired
	private DiscoveryClient discoveryClient;

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String index() {
		ServiceInstance instance = discoveryClient.getLocalServiceInstance();
		return "host:" + instance.getHost() + ", service_id:" + instance.getServiceId();
	}
}