package com.qf.springcloud.pojo.vo;

import com.qf.springcloud.pojo.entity.Goods;
import lombok.Data;

/**
 * 作者：杜夫人
 * date: 2020/8/24
 */
@Data
public class GoodsVO extends Goods {

    private MerchantVO merchant;// 这个商品所属的商户

    private String merchantName,updateUserName;


}
