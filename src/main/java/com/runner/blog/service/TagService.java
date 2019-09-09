package com.runner.blog.service;

import com.runner.blog.entity.Tag;

import java.util.List;

/**
 * @auther 郭永江
 * @date 2019/9/4 14:40
 */
public interface TagService {
    //根据ID查询标签
    Tag selectTagId(int id);

    //查询所有的标签
    List<Tag> selectAllTag();
}
