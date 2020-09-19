package com.qf.springcloud.pojo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 作者：杜夫人
 * date: 2020/8/6
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageDTO {

    private Integer count;// 分页总数

    private Object data;// 只能叫data

    private Integer code = 0;

    private String msg;// 返回的消息

    public static PageDTO setPageData(Integer count, Object data) {
        return new PageDTO(count, data, 0, "成功");
    }

    public static PageDTO setPageData(Integer count, Object data, String msg) {
        return new PageDTO(count, data, 0, msg);
    }
}
