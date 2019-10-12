package com.atguigu.consummer2.Service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*注解注解指定Eureka注册中心的某一个微服务名称，*/
/*引用统一的客户端的备用服务*/
@FeignClient(value = "ScenicServer")
public interface Feign {
    /*通过service发起对 微服务的请求*/

    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public  String getTicket();

}
