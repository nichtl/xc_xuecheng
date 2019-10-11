package com.atguigu.consummer2.Service;


/*服务的降级处理
* 被选响应*/
/*
@Component
public class FallBack  implements FallbackFactory<Feign> {
    @Override
    public Feign create(Throwable throwable) {
        return  new Feign() {
            @Override
            public String getTicket() {
                return "这是客户端服务降级返回的信息";
            }
        };
    }
}
*/
