package com.runner.blog.service;

import com.runner.blog.entity.Tag;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @auther 郭永江
 * @date 2019/9/4 14:40
 */
public interface TagService {
    /**
     *  根据ID查询标签
     * @param
     * @return
     */
    Tag selectTagId(HttpServletRequest request);

    /**
     * 查询所有的标签
     * @return
     */
    List<Tag> selectAllTag();

    /**
     * 模糊查询标签
     * @param
     * @return
     */
    List<Tag> vagueTag(HttpServletRequest request);
}
