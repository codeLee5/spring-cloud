package com.qf.springcloud.service;

import com.qf.springcloud.pojo.dto.ResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author codeLee
 * @date 2020/9/16
 */
@FeignClient(name = "CLOUD-USER-SERVICE-LEE")
public interface UserServiceFeign {

    @RequestMapping("user/findById/{userId}")
    ResponseDTO findById(@PathVariable Long userId) ;

    @RequestMapping("user/findByNameAndPhone")
    ResponseDTO findByNameAndPhone(@RequestParam("nickName") String nickName,@RequestParam("phone")  String phone);
}
