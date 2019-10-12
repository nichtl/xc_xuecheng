package com.atguigu.serverconsumer.server;


import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/*服务的降级处理
* 被选响应*/
@Component
public class FallBack  implements FallbackFactory<Feign> {
    @Override
    public Feign create(Throwable throwable) {
        return  new Feign() {
            @Override
            public String getTicket() {
                return "这是客户端服务降级返回的信息";
            }

            @Override
            public List getScenic() {
                List  lst = new ArrayList();
                lst.add("null");
                return lst;
            }
        };
    }
}
