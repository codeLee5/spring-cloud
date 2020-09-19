package com.qf.springcloud.controller.pages.back;

import com.qf.springcloud.pojo.dto.ResponseDTO;
import com.qf.springcloud.service.UserServiceFeign;
import com.qf.springcloud.service.UserServiceHystrixFeign;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author codeLee
 * @date 2020/9/15
 */
@RestController
@RequestMapping("pages/back/user")
public class UserController {
    @Resource
    RestTemplate restTemplate;
    @Resource
    UserServiceFeign userServiceFeign;
    @Resource
    UserServiceHystrixFeign userServiceHystrixFeign;

//    @RequestMapping("findById/{userId}")
//    ResponseDTO findById(@PathVariable Long userId){
//       return userServiceFeign.findById(userId);
//    }
    @RequestMapping("findById/{userId}")
    ResponseDTO findById(@PathVariable Long userId){
       return userServiceHystrixFeign.findById(userId);
    }


    @RequestMapping("findByNameAndPhone")
    ResponseDTO findByNameAndPhone(String name,String phone){
       return userServiceFeign.findByNameAndPhone(name,phone);
    }


}
