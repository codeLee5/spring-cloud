package com.qf.springcloud.pojo.query;

import lombok.Data;

/**
 * 作者：杜夫人
 * date: 2020/8/6
 */
@Data
public class PageQuery {

    private Integer page = 1;// 当前页码

    private Integer limit = 10;// 每页展示多少行

    private Integer start = 0;// 偏移量

    public Integer getStart() {
        return (page - 1) * limit;
    }
}
