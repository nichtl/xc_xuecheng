package com.atguigu.consummer2.controller;

import com.atguigu.consummer2.Service.Feign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Usercontroller {
    @Autowired
    private Feign feignservice;
    @RequestMapping("/get")
    public  String getTic(){
        return  this.feignservice.getTicket();
    }


}
