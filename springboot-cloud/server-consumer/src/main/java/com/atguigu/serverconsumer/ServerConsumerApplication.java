package com.atguigu.serverconsumer;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
/*开启发现服务功能*/
@EnableDiscoveryClient
/*注解开启 使用自定义负载均衡规则*/
public class ServerConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerConsumerApplication.class, args);
    }
    @LoadBalanced //  启用负载均衡机制  默认的是轮询 ，让多个同样的服务都被平均调用
    @Bean
    public RestTemplate restTemplate(){
           return  new RestTemplate();
    }
    /*更换为ribbon其他的算法*/
    @Bean   //当检测到有继承IRULE 接口的方法后不再使用默认的轮询，替换为 该方法中的策略
    public IRule myruel(){
      return new RandomRule();
  }

}
