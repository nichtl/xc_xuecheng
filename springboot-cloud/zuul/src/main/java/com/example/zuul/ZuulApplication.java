package com.example.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
/*开启 Zuul的功能*/
@EnableZuulProxy
public class ZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }

    /*
    * 访问 服务提供者  localhost:8002 /get
    * 使用ZUUL  http://myzuul.com:9527/provider-server/get，，zuul 的地址 /  服务提供者在eureka 中的名称  /  请求
    * */


}
