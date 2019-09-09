package com.runner.blog.controller;


import com.runner.blog.service.TagService;
import com.runner.model.DataResponse;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;



/**
 * 文章标签表
 * @author
 * @since 2019-09-04
 */
@RestController
@RequestMapping("/tag")
public class TagController  {

    @Resource
    private TagService tagService;

    @RequestMapping("/selectTagId")
    @ResponseBody
    public DataResponse selectTagId(HttpServletRequest request){
        DataResponse response = new DataResponse();
        response.setData(tagService.selectTagId(Integer.parseInt(request.getParameter("id"))));
        return response;
    }

    @RequestMapping("/selectAllTag")
    public DataResponse selectAllTag(){
        DataResponse response = new DataResponse();
        return response.setData(tagService.selectAllTag());
    }


}
