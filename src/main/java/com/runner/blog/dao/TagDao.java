package com.runner.blog.dao;

import com.runner.blog.entity.Tag;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 郭永江
 * @date 2019/9/4 14:40
 */
@Mapper
public interface TagDao {
    /**
     * 根据ID查询标签
     * @param id
     * @return Tag
     */
    Tag selectTagId(@Param("id") int id);

    /**
     * 查询所有的标签
     * @return List<Tag>
     */
    List<Tag> selectAllTag();

    /**
     * 模糊查询标签
     * @param tagName
     * @return
     */
    List<Tag> vagueTag(@Param("tagName") String tagName);
}
