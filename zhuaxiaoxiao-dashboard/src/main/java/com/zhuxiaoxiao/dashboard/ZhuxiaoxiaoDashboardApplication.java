package com.zhuxiaoxiao.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@SpringCloudApplication
public class ZhuxiaoxiaoDashboardApplication {

    public static void main(String[] args){
        SpringApplication.run(ZhuxiaoxiaoDashboardApplication.class,args);
    }
}
