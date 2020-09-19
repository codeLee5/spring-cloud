package com.qf.springcloud.pojo.query;

import lombok.Data;

import java.util.Date;

/**
 * 作者：杜夫人
 * date: 2020/8/13
 */
@Data
public class UserQuery extends PageQuery {
    private Long userId;

    private String password = "123456";
    private String code;
    private String principal, nickName, phone, realName, note;

    //    @DateTimeFormat();// 可以解决
    private Date startCreateTime, endCreateTime;// 开始和结束创建的时间。直接由前端传递过来就可以了


    private Boolean isPasswordLogin = true;// 默认是密码登录
    private Boolean isBack = false;// 默认 不是后台登录


}
