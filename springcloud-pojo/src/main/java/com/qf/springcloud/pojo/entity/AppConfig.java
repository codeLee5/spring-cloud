package com.qf.springcloud.pojo.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * app_config
 * @author
 */
@Data
@Accessors(chain = true) // 采用链式表达式
public class AppConfig implements Serializable {
    /**
     * 配置id
     */
    private Integer configId;

    /**
     * 配置的键名：如banner
     */
    private String key;

    /**
     * 配置的值：json字符串
     */
    private String value;

    /**
     * 配置说明
     */
    private String note;

    /**
     * 反射类的全路径包名称？Class.forName("全路径包名称")
     */
    private String className;

    /**
     * 是否是数组【】？是1 否0 //{}
     */
    private Boolean isArr;
    private static final long serialVersionUID = 1L;
}
