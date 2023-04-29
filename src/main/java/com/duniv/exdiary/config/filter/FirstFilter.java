package com.duniv.exdiary.config.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.FilterConfig;
import java.io.IOException;

@Slf4j
public class FirstFilter{
    //@Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //Filter.super.init(filterConfig);
        log.info("===== This is Filter =====");
    }

    //@Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

    }

    //@Override
    public void destroy() {
        //Filter.super.destroy();
    }
}
