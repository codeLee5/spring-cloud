package com.qf.springcloud.pojo.enums;

/**
 * 作者：杜夫人
 * date: 2020/8/13
 */
public enum SmsCodeModel {
    LOGIN_CODE("SMS_196658529"),
    AUTH_PRINCIPAL_CODE("SMS_197210114");


    private String model;

    SmsCodeModel(String model) {
        this.model = model;
    }

    public String getModelCode() {
        return this.model;
    }
}
