package com.runner.blog.service;

import com.runner.blog.entity.BlogArticles;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author 郭永江
 * @date 2019/9/21 19:39
 */
public interface BlogArticlesService {
    /**
     * 获取所有文章列表
     * @return
     */
    List<BlogArticles> getArticleAll(HttpServletRequest request);

    /**
     * 模糊查询文章
     * @param request
     * @return
     */
    List<BlogArticles> vagueArticle(HttpServletRequest request);
}
