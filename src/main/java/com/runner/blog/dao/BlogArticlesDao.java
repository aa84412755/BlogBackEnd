package com.runner.blog.dao;

import com.runner.blog.entity.BlogArticles;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.hibernate.validator.constraints.EAN;

import java.util.List;

/**
 * @author 郭永江
 * @date 2019/9/21 19:29
 */
@Mapper
public interface BlogArticlesDao {
    /**
     * 获取所有文章列表
     * @return
     */
    List<BlogArticles> getArticleAll(@Param("from") int from , @Param("count") int count);

    /**
     * 模糊查询文章
     * @param articleName
     * @return
     */
    List<BlogArticles> vagueArticle(@Param("articleName") String articleName);

}
