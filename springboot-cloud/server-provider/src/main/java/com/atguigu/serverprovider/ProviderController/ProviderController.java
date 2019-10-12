package com.atguigu.serverprovider.ProviderController;

import com.atguigu.serverprovider.Enity.Scenic;
import com.atguigu.serverprovider.service.ProviderService;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class ProviderController {

    @Autowired
    ProviderService providerService;
   @GetMapping("/get")
    public  String getTicklet(){
/*    if ( null == id){
        throw new RuntimeException("你的id"+id+"被加入黑名单");
    }*/
        return  providerService.getTickter();
    }
    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public List<Scenic>  GetallScenic(){
       System.out.println("********"+"进水水水水");
       List<Scenic>  scenic = providerService.FindAllScenicMsg();
         System.out.println(scenic.get(0));
        return  scenic;
    }




}



