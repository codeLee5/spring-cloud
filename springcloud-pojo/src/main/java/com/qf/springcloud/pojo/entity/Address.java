package com.qf.springcloud.pojo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * address
 * @author
 */
@Data
public class Address implements Serializable {
    /**
     * 收货地址id
     */
    private Long addressId;

    /**
     * 外键用户
     */
    private Long userId;

    /**
     * 省市区（province city distrect）
     */
    private String pcd;

    /**
     * 楼层门牌号
     */
    private String floorDoorNumber;

    /**
     * 收货电话
     */
    private String phone;

    /**
     * 收货人
     */
    private String receiver;

    /**
     * 是否默认：1或0
     */
    private Boolean moren;

    /**
     * 地址标签：家、学校、公司
     */
    private String tag;

    /**
     * 经度
     */
    private Double lng;

    /**
     * 纬度
     */
    private Double lat;

    /**
     * 小区大厦学校名称
     */
    private String name;

    /**
     * 城市编码:指的是城市的编码，计算达达运费的时候是需要的
     */
    private String cityCode;

    private static final long serialVersionUID = 1L;
}
