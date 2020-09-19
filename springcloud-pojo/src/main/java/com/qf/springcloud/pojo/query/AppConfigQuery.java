package com.qf.springcloud.pojo.query;

import lombok.Data;

/**
 * 作者：杜夫人
 * date: 2020/8/25
 */
@Data
public class AppConfigQuery  extends PageQuery{
    private String note,key;
}
