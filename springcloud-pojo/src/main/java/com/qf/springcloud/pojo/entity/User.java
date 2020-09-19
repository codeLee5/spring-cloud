package com.qf.springcloud.pojo.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

/**
 * user
 * @author
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User implements Serializable {

    /**
     * 用户主键id
     */

    private Long userId;

    /**
     * 用户昵称
     */
    private String nickName;

    /**
     * 真名字
     */
    private String realName;

    /**
     * 密码
     */
    private String password;

    /**
     * 电话
     */
    private String phone;

    /**
     * 邮箱可以为null
     */
    private String email;

    /**
     * 上次登录ip:检测用户异地登录
     */
    private String lastLoginIp;

    /**
     * 上次登录日期
     */
    private Date lastLoginTime;

    /**
     * 角色组，逗号分隔(长文本类型)
     */
    private String roles;

    /**
     * 备注
     */
    private String note;

    /**
     * 用户头像地址
     */
    private String photo;

    /**
     * 微信号的open_id（可以授权登录以及付款）
     */
    private String openId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 最近更新时间
     */
    private Date updateTime;

    /**
     * 谁更新的
     */
    private Long updateUser;

    private static final long serialVersionUID = 1L;
}
