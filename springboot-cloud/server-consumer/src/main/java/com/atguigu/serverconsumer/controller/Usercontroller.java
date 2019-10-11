package com.atguigu.serverconsumer.controller;
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
    RestTemplate restTemplate;
@GetMapping("/buy")
    public String buyticket(){
    String s=restTemplate.getForObject("http://SCENIC-SERVER/get",String.class);
    return s;
}
@GetMapping("/AS")
    public List getallScenic(){
     List s  =    restTemplate.getForObject("http://SCENIC-SERVER/all", List.class);
     return  s;
}


}
