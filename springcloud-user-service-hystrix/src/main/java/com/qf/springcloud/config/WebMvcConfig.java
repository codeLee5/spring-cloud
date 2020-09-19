package com.qf.springcloud.config;

import com.qf.springcloud.interceptor.CheckToken;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * @author codeLee
 * @date 2020/9/18
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Resource
    CheckToken checkToken;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(checkToken).addPathPatterns("/user/**");
    }
}
