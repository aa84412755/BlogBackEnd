package com.runner.blog.controller;

import com.runner.blog.model.DataResponse;
import com.runner.blog.service.TouristService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author 郭永江
 * @date 2019/9/30 13:58
 */
@RestController
@RequestMapping("/tourist")
public class TouristController {

    @Resource
    private TouristService touristService;

    @RequestMapping("/addTourist")
    @ResponseBody
    public DataResponse addTourist(HttpServletRequest req){
        DataResponse res = new DataResponse();
        int tourist = touristService.addTourist(req);
        res.setData(tourist);
        return res;
    }


}
