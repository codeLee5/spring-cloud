package com.qf.springcloud.pojo.query;

import lombok.Data;

/**
 * 作者：杜夫人
 * date: 2020/8/20
 */
@Data
public class MerchantQuery extends PageQuery {
    private Long merchantId;
    private String shopName, contactName, location, approvalStatus, takeawayPhone;
    private Boolean isOpen;

    private Double minLng, minLat, maxLng, maxLat, lng, lat;
    // 距离，用户输入的查询范围？默认就是5千米范围内的商户
    private Double distance = 5.0;

}
