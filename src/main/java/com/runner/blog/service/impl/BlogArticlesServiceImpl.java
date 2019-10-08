package com.runner.blog.service.impl;

import com.runner.blog.dao.BlogArticlesDao;
import com.runner.blog.entity.BlogArticles;
import com.runner.blog.service.BlogArticlesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author 郭永江
 * @date 2019/9/21 19:42
 */
@Service
public class BlogArticlesServiceImpl implements BlogArticlesService {
    private static Logger LOGGER = LoggerFactory.getLogger(BlogArticlesServiceImpl.class);


    @Resource
    private BlogArticlesDao blogArticlesDao;

    @Override
    public List<BlogArticles> getArticleAll(HttpServletRequest request) {
        Integer from = Integer.parseInt(request.getParameter("from"));
        Integer count = Integer.parseInt(request.getParameter("count"));
        if (from == 1){
            from-=1;
        }else if (from > 1){
            from = from * count;
        }
        return blogArticlesDao.getArticleAll(from,count);
    }

    @Override
    public List<BlogArticles> vagueArticle(HttpServletRequest request) {
        String articleName = request.getParameter("articleName");
        return blogArticlesDao.vagueArticle(articleName);
    }
}
