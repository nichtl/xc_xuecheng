package com.atguigu.serverconsumer.controller;
import com.atguigu.serverconsumer.server.Feign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.util.List;
import java.util.Objects;

import  com.atguigu.*;
@RestController
public class Usercontroller {
    @Autowired
     private Feign feign;


@GetMapping("/get")
  public  String Getaa(){
    return  feign.getTicket();
}
@GetMapping("/btn")
  public  List getscenic(){
    return feign.getScenic();
}

}
