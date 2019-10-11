package com.atguigu.serverprovider.service;

import com.atguigu.serverprovider.Enity.Scenic;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProviderService {
 /*   @HystrixCommand()
    public String getTickter() {
        System.out.println("8002");
     return  "8002服务提供者给了你一张票";
    }*/
 public  String getTickter();
 List<Scenic> FindAllScenicMsg();
}
