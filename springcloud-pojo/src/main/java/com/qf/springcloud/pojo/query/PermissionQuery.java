package com.qf.springcloud.pojo.query;

import lombok.Data;

/**
 * 作者：杜夫人
 * date: 2020/8/14
 */
@Data
public class PermissionQuery extends PageQuery {

    private String name,note;
}
