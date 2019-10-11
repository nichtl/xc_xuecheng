package com.atguigu.consummer2.Service;

/*注解注解指定Eureka注册中心的某一个微服务名称，*/
/*引用统一的客户端的备用服务*/

public class Feign {
    /*通过service发起对 微服务的请求*/

    public  String getTicket(){
        return "ok";
    };

}
