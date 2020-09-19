package com.qf.springcloud.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;
import org.springframework.util.Base64Utils;

/**
 * @author codeLee
 * @date 2020/9/18
 */
@Component
public class AddHeaderFilter extends ZuulFilter {//网关过滤器
    @Override
    public String filterType() {//过滤类型 pre:网关之前
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {//过滤类型的执行顺序，多个过滤器时，顺序从小到大
        return 1;
    }

    @Override
    public boolean shouldFilter() {//是否过滤 true：开启
        return true;
    }

    @Override
    public Object run() throws ZuulException {//具体过滤规则 核心方法
        System.err.println("这是pre过滤器");
        RequestContext currentContext = RequestContext.getCurrentContext();

       String token ="Basic"+ Base64Utils.encodeToString("qf:lee".getBytes());
       currentContext.addZuulRequestHeader("token",token);
        return null;
    }
}
