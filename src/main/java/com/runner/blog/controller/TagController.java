package com.runner.blog.controller;


import com.runner.blog.model.DataResponse;
import com.runner.blog.service.TagService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;



/**
 * 文章标签表
 * @author 郭永江
 * @since 2019-09-04
 */
@RestController
@RequestMapping("/tag")
public class TagController  {

    @Resource
    private TagService tagService;

    /**
     * 根据ID查询标签
     * @param request
     * @return DataResponse
     */
    @RequestMapping("/selectTagId")
    @ResponseBody
    public DataResponse selectTagId(HttpServletRequest request){
        DataResponse response = new DataResponse();
        response.setData(tagService.selectTagId(request));
        return response;
    }

    /**
     * 查询所有的标签
     * @return DataResponse
     */
    @RequestMapping("/selectAllTag")
    public DataResponse selectAllTag(){
        DataResponse response = new DataResponse();
        return response.setData(tagService.selectAllTag());
    }

    /**
     * 根据标签名模糊查询
     * @param request
     * @return DataResponse
     */
    @RequestMapping("/vagueTag")
    @ResponseBody
    public DataResponse vagueTag(HttpServletRequest request){
        DataResponse response = new DataResponse();
        response.setData(tagService.vagueTag(request));
        return response;
    }


}
