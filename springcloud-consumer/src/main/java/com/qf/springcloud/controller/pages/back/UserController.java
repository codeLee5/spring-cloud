package com.qf.springcloud.controller.pages.back;

import com.netflix.discovery.EurekaClient;
import com.qf.springcloud.controller.BaseController;
import com.qf.springcloud.pojo.dto.ResponseDTO;
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
public class UserController extends BaseController {
    @Resource
    RestTemplate restTemplate;

    @RequestMapping("findById/{userId}")
    ResponseDTO findById(@PathVariable Long userId){
        ResponseDTO forObject = restTemplate.getForObject(getApi("cloud-user-service-lee", "user/findById/" + userId), ResponseDTO.class);
        return forObject;
    }

}
