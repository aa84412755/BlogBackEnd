package com.runner.blog.entity;

import lombok.Data;
import java.util.Date;

/**
 * @author 郭永江
 */
@Data
public class Tagarticlesrelational {
    /**
     * 自增id
     */
    private int id;
    /**
     * 标签表id
     */
    private int tagId;
    /**
     * 文章表Id
     */
    private int articlesId;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;


}
