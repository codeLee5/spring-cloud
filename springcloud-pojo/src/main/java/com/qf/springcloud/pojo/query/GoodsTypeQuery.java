package com.qf.springcloud.pojo.query;

import lombok.Data;

/**
 * 作者：杜夫人
 * date: 2020/8/24
 */
@Data
public class GoodsTypeQuery extends PageQuery {
    private String typeName;
    private Long merchantId;// 必须要指定商户id

}
