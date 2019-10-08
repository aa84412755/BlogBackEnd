package com.runner.blog.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.runner.blog.dao.TouristDao;
import com.runner.blog.entity.Tourist;
import com.runner.blog.service.TouristService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author 郭永江
 * @date 2019/9/30 13:57
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class TouristServiceImpl implements TouristService{
    private static Logger LOGGER = LoggerFactory.getLogger(TouristServiceImpl.class);

    @Resource
    private TouristDao touristDao;

    @Override
    public int addTourist(HttpServletRequest request) {
        String touristJson = request.getParameter("tourist");
        Tourist tourist = JSONObject.parseObject(touristJson,Tourist.class);
        return touristDao.addTourist(tourist);
    }

    @Override
    public int selectip(HttpServletRequest request) {
        return 0;
    }
}
