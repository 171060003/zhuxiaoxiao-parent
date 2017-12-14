package com.zhuxiaoxiao.consumer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class IndexService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "error")
    public String helloService() {
        return restTemplate.getForEntity("http://CLIENT/index", String.class).getBody();
    }

    public String error() {
        return "error";
    }
}
