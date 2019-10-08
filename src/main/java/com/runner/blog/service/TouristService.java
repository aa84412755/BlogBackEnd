package com.runner.blog.service;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 郭永江
 * @date 2019/9/30 13:57
 */
public interface TouristService {

    int addTourist(HttpServletRequest request);

    int selectip(HttpServletRequest request);
}
