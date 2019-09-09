package com.runner.blog.entity;

import lombok.Data;
import java.util.Date;

/**
 * @auther 郭永江
 * @date 2019/9/4 14:44
 */
@Data
public class Tourist {
    /**
     * 游客id
     */
    private int touristId;
    /**
     * 访问地址
     */
    private String visitingCities;
    /**
     * IP地址
     */
    private String ipAddress;
    /**
     * MAC地址
     */
    private String macAddress;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
}
