package com.runner.blog.entity;

import lombok.Data;

import java.util.Date;


/**
 * @auther 郭永江
 * @date 2019/9/4 14:44
 */
@Data
public class Blogarticles {
    /**
     * 文章id
     */
    private int articlesId;
    /**
     * 外键博主id
     */
    private int bloggerId;
    /**
     * 文章标签id，关联标签表
     */
    private int tagId;
    /**
     *  文章路径
     */
    private String articlesUrl;
    /**
     *  文章名称
     */
    private String articleName;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * //更新时间
     */
    private Date updateTime;
}
