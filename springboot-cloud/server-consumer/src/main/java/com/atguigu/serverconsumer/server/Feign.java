package com.atguigu.serverconsumer.server;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "ScenicServer",fallbackFactory = FallBack.class)
public interface Feign {
    /*通过service发起对 微服务的请求*/
    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public  String getTicket();
    @RequestMapping(value="/all",method = RequestMethod.GET)
    public List getScenic() ;

}
