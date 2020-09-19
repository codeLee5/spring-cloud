package com.qf.springcloud.pojo.vo;


import com.qf.springcloud.pojo.entity.GoodsType;
import lombok.Data;

import java.util.List;

/**
 * 作者：杜夫人
 * date: 2020/8/24
 */
@Data
public class GoodsTypeVO extends GoodsType {

    /**
     * 一个商品类型对应的它的所有商品
     */
    List<GoodsVO> goodsVOS;
}
