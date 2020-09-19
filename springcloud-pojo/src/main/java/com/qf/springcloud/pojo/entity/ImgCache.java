package com.qf.springcloud.pojo.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * img_cache
 * @author
 */
@Data
public class ImgCache implements Serializable {
    /**
     * 图片的缓存的地址（实际图片保存的磁盘路径）
     */
    private String imgUrl;

    /**
     * 图片缓存的时间节点
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;
}
