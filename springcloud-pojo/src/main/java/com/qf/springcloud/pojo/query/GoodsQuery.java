package com.qf.springcloud.pojo.query;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 作者：杜夫人
 * date: 2020/8/24
 */
@Data
public class GoodsQuery extends PageQuery {
    private Long merchantId, goodsTypeId;// 根据商户id，商品类型id来查询
    private String title;
    private BigDecimal minPrice, maxPrice;
    private Boolean onSale;

}
