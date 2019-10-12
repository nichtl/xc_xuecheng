package com.example.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@SpringBootApplication
/*开启 Zuul的功能*/
@EnableZuulProxy
@EnableEurekaClient
public class ZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }

    /*
    * 访问 服务提供者  localhost:8002 /get
    * zuul只能使用咋iEureka中注册的服务
    * 若消费者关闭了注册那么就无法使用服务
    * 使用ZUUL  http://myzuul.com:9527/provider-server/get，，zuul 的地址 /  服务提供者在eureka 中的名称  /  请求
    * */


}
