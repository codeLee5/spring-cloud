package com.qf.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.hystrix.contrib.javanica.conf.HystrixPropertiesManager;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import com.qf.springcloud.pojo.dto.ResponseDTO;
import com.qf.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.naming.Name;

/**
 * @author codeLee
 * @date 2020/9/15
 */
@RestController
@RequestMapping("user")
public class UserRestController {
    @Resource
    UserService userService;
    @Value("${server.port}")
    String port;

    @RequestMapping("findById/{userId}")
    @HystrixCommand(
            fallbackMethod = "findByIdFallBack",
            commandProperties = {
                @HystrixProperty(name = HystrixPropertiesManager.EXECUTION_ISOLATION_THREAD_TIMEOUT_IN_MILLISECONDS,value = "1000")}
            )
    ResponseDTO findById(@PathVariable Long userId) {
        ResponseDTO responseDTO = userService.findUserById(userId);
        responseDTO.setMsg("提供服务的端口是:"+port);
//        System.err.println(1/0);
        return responseDTO;
    }

    ResponseDTO findByIdFallBack(@PathVariable Long userId) {
        return  ResponseDTO.ok("---熔断方法的备选方法");
    }





    @RequestMapping("findByNameAndPhone")
    ResponseDTO findByNameAndPhone( String nickName,String phone) {
        return userService.findByNameAndPhone(nickName,phone);
    }
}
