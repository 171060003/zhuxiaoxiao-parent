package com.zhuxiaoxiao.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ZhuxiaoxiaoEurekaApplication {

	public static void main(String[] args) {
//		SpringApplicationBuilder springApplicationBuilder =  new SpringApplicationBuilder(ZhuxiaoxiaoEurekaApplication.class);
//		springApplicationBuilder.web(true);
//		springApplicationBuilder.run(args);

		SpringApplication.run(ZhuxiaoxiaoEurekaApplication.class, args);
	}
}
