package com.qf.springcloud.pojo.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * order_item
 * @author
 */
@Data
public class OrderItem implements Serializable {
    /**
     * 主键id
     */
    private Long orderItemId;

    /**
     * 订单id
     */
    private Long orderId;

    /**
     * 下单时候的商品图片地址
     */
    private String goodsImg;

    /**
     * 下单时候的商品数量
     */
    private String goodsCount;

    /**
     * 原来的商品id:拿来跳转到现在的这个商品页面
     */
    private Long originGoodsId;

    /**
     * 下单时候的商品名称
     */
    private String goodsTitle;

    /**
     * 商品下单的时候的原价
     */
    private BigDecimal goodsOldPrice;

    /**
     * 下单时候的价格实际价格
     */
    private BigDecimal goodsPrice;

    /**
     * 商户id:冗余字段：是专门拿来给程序查询方便用的
     */
    private Long merchantId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 用户id：冗余字段：也是方便拿来程序查询使用
     */
    private Long userId;

    private static final long serialVersionUID = 1L;
}
