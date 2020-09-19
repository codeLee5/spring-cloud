package com.qf.springcloud.pojo.dto;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 作者：杜夫人
 * date: 2020/8/7
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)// 忽略为null的字段不传递到前端去。
public class ResponseDTO implements Serializable {
    // 返回的消息
    private String msg;

    private Boolean res = true;

    private Object data;// 可能是集合，可能是对象，可能是基本类型

    private Integer code = 200;// 状态码


    // 成功的方法
    public static ResponseDTO ok() {
        return new ResponseDTO("操作成功", true, null, 200);
    }

    // 成功的方法,之传递消息，不传递数据
    public static ResponseDTO ok(String msg) {
        return new ResponseDTO(msg, true, null, 200);
    }

    // 成功的方法,之传递消息，传递数据
    public static ResponseDTO ok(String msg, Object data) {
        return new ResponseDTO(msg, true, data, 200);
    }


    // 成功的方法
    public static ResponseDTO fail() {
        return new ResponseDTO("操作失败", false, null, null);
    }

    // 成功的方法,之传递消息，不传递数据
    public static ResponseDTO fail(String msg) {
        return new ResponseDTO(msg, false, null, null);
    }

    // 成功的方法,之传递消息，传递数据
    public static ResponseDTO fail(String msg, Object data) {
        return new ResponseDTO(msg, false, data, null);
    }


    public static ResponseDTO get(boolean res) {
        return res ? ok() : fail();// 根据结果来返回成功或者失败的统一返回对象
    }

    // 第一个参数是指的错误消息
    public static ResponseDTO fail(String msg, Object result, int errorCode) {
        return new ResponseDTO(msg, false, result, errorCode);
    }

    /**
     * 把本来是Object类型的data转换成你指定的泛型，但是泛型必须是data真正的类型
     * @param cls
     * @param <T>
     * @return
     */
    public <T> T getObject(Class<T> cls) {
        return JSON.parseObject(JSON.toJSONString(data), cls);
    }
}
