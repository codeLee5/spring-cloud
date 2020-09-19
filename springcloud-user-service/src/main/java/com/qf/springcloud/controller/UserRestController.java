package com.qf.springcloud.controller;

import com.qf.springcloud.pojo.dto.ResponseDTO;
import com.qf.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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
    ResponseDTO findById(@PathVariable Long userId) {
        ResponseDTO responseDTO = userService.findUserById(userId);
        responseDTO.setMsg("端口是:"+port);
        return responseDTO;
    }

    @RequestMapping("findByNameAndPhone")
    ResponseDTO findByNameAndPhone( String nickName,String phone) {
        return userService.findByNameAndPhone(nickName,phone);
    }
}
