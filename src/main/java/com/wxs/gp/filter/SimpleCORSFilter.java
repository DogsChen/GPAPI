package com.wxs.gp.filter;


import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SimpleCORSFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    //过滤器方式解决后端返回前端中文乱码以及跨域问题一点用也没有！！！！
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse httpResponse = (HttpServletResponse) response;


        httpResponse.addHeader("Access-Control-Allow-Origin", "*");
        //httpResponse.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
        httpResponse.setHeader("Access-Control-Allow-Headers", "Origin, No-Cache, X-Requested-With, If-Modified-Since, Pragma, Last-Modified, Cache-Control, Expires, Content-Type, X-E4M-With,userId,access_token,refresh_token");
        httpResponse.setHeader("Access-Control-Allow-Methods", "GET, PUT, DELETE, POST");
        httpResponse.setHeader("Access-Control-Allow-Credentials", "true");
        httpResponse.setHeader("Access-Control-Max-Age", "0");
        httpResponse.setContentType("application/json;charset=utf-8");
//        httpResponse.setHeader("XDomainRequestAllowed","1");
        System.out.println("cors 过滤器");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}

