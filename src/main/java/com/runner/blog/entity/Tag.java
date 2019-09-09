package com.runner.blog.entity;

import lombok.Data;

import java.util.Date;


/**
 * @auther 郭永江
 * @date 2019/9/4 14:44
 */
@Data
public class Tag {
    /**
     * 标签id
     */
    private int id;
    /**
     * 标签名称
     */
    private String tagName;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;

}
