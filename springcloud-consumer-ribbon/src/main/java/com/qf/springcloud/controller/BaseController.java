package com.qf.springcloud.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;

import javax.annotation.Resource;

/**
 * @author codeLee
 * @date 2020/9/15
 */
public class BaseController {
    @Resource
    EurekaClient eurekaClient;
    protected String getApi(String appName,String api){
        // 通过微服务的名字去获取它的ip和端口
        InstanceInfo nextServerFromEureka = eurekaClient.getNextServerFromEureka(appName, false);
        String homePageUrl = nextServerFromEureka.getHomePageUrl();
        return homePageUrl+api;

    }

}
