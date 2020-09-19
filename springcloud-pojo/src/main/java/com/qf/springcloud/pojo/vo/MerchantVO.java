package com.qf.springcloud.pojo.vo;

import com.qf.springcloud.pojo.entity.Merchant;
import lombok.Data;

import java.util.List;

/**
 * 作者：杜夫人
 * date: 2020/8/24
 */
@Data
public class MerchantVO extends Merchant {

    // 商户单个最好的商品
    private GoodsVO bestGoods;

    private List<GoodsTypeVO> goodsTypeList;// 此商户的所有商品类型
}
