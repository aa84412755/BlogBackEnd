package com.runner.blog.service.impl;

import com.runner.blog.dao.TagDao;
import com.runner.blog.entity.Tag;
import com.runner.blog.service.TagService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @auther 郭永江
 * @date 2019/9/4 14:41
 */
@Service
public class TagServiceImpl implements TagService {
    private static Logger LOGGER = LoggerFactory.getLogger(TagServiceImpl.class);
    @Resource
    private TagDao tagDao;

    @Override
    public Tag selectTagId(HttpServletRequest req) {
        int id = Integer.parseInt(req.getParameter("id"));
        return tagDao.selectTagId(id);
    }

    @Override
    public List<Tag> selectAllTag() {
        return tagDao.selectAllTag();
    }

    @Override
    public List<Tag> vagueTag(HttpServletRequest req) {
        String tagName = req.getParameter("tagName");
        return tagDao.vagueTag(tagName);
    }
}
