package com.qf.springcloud.config.ribbon;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author codeLee
 * @date 2020/9/16
 */
@Configuration
public class LoadBalanceRuleConfig {

    @Bean
   public IRule iRule(){
        return new MyLoadBalanceRule() ;
    }
}
