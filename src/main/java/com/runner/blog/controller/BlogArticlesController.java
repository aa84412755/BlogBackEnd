package com.runner.blog.controller;

import com.runner.blog.entity.BlogArticles;
import com.runner.blog.model.DataResponse;
import com.runner.blog.service.BlogArticlesService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author 郭永江
 * @date 2019/9/29 9:35
 */
@RestController
@RequestMapping("/blogArticles")
public class BlogArticlesController {
    @Resource
    private BlogArticlesService blogArticlesService;

    /**
     * 获取所有文章列表
     * @param req
     * @return
     */
    @RequestMapping("/getArticleAll")
    @ResponseBody
    public DataResponse getArticleAll(HttpServletRequest req){
        DataResponse res = new DataResponse();
        List<BlogArticles> list = blogArticlesService.getArticleAll(req);
        return res.setData(list);
    }

    /**
     * 模糊查询文章
     * @param req
     * @return
     */
    @RequestMapping("/vagueArticle")
    @ResponseBody
    public DataResponse vagueArticle(HttpServletRequest req){
        DataResponse res = new DataResponse();
        List<BlogArticles> list = blogArticlesService.vagueArticle(req);
        return res.setData(list);
    }

}
