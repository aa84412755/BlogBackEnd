package com.runner.blog.dao;

import com.runner.blog.entity.Tag;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @auther 郭永江
 * @date 2019/9/4 14:40
 */
@Mapper
public interface TagDao {
    //根据ID查询标签
    Tag selectTagId(int id);

    //查询所有的标签
    List<Tag> selectAllTag();
}
