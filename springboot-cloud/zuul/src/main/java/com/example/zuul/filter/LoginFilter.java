package com.example.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Component   /*zuul 拦截登陆请求*/
public class LoginFilter  extends ZuulFilter {
    /*重写4个方法
    *   filterType   通过return 指定的值选择过滤器类型  pre  路由之前   routing  路由之时  post  路由之后   error 发生错误后调用
    *   filterOrder   选择过滤的顺序
    *   shouldFilter   选择是否过滤
    *
    *
    * */
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;  /*0 最优先  值越小月优先*/
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        /*过滤器的逻辑*/
        /*获得请求上下文*/
        RequestContext requestContext  = RequestContext.getCurrentContext();
        HttpServletRequest  request = requestContext.getRequest();
        String token =request.getParameter("token");  /*获取请求中的令牌判断是否登陆*/
        if(token == null) {
            requestContext.setSendZuulResponse(false);
            requestContext.setResponseStatusCode(401);
            try{
                requestContext.getResponse().getWriter().write("非法请求");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}
