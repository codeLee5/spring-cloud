package com.qf.springcloud.pojo.vo;

import com.qf.springcloud.pojo.entity.OrderItem;
import com.qf.springcloud.pojo.entity.TcOrder;
import lombok.Data;

import java.util.List;

/**
 * 作者：杜夫人
 * date: 2020/8/27
 */
@Data
public class OrderVO extends TcOrder {
    private String orderItemsStr;// 这个字符串就是用来接收订单详情的数据的字符串，等会用fastJSON把它变成订单详情集合即可
    private List<OrderItem> orderItems;
    private List<GoodsVO> goodsVOS;


}
