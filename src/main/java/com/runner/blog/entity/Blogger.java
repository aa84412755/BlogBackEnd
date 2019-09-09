package com.runner.blog.entity;

import lombok.Data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @auther 郭永江
 * @date 2019/9/4 14:44
 */
@Data
public class Blogger {
    /**
     * 博主id
     */
    private int bloggerId;
    /**
     * 昵称
     */
    private String nickName;
    /**
     * 密码
     */
    private String passWord;
    /**
     * 性别
     */
    private Boolean sex;
    /**
     * 生日
     */
    private Date birthday;
    /**
     * 邮箱
     */
    private String email;
    /**
     *  qq(社交软件账号)
     */
    private String qq;
    /**
     * 微信(社交软件账号)
     */
    private String weChat;
    /**
     * 博客(社交软件账号)
     */
    private String microBlog;
    /**
     * gitHub
     */
    private String gitHub;
    /**
     * 创建时间
     */
    private Timestamp createTime;

    /**
     * 更新时间
     */
    private Timestamp updateTime;
}
