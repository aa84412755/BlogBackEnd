package com.runner.blog.service.impl;

import com.runner.blog.dao.TagDao;
import com.runner.blog.entity.Tag;
import com.runner.blog.service.TagService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @auther 郭永江
 * @date 2019/9/4 14:41
 */
@Service
public class TagServiceImpl implements TagService {

    @Resource
    private TagDao tagDao;

    @Override
    public Tag selectTagId(int id) {
        return tagDao.selectTagId(id);
    }

    @Override
    public List<Tag> selectAllTag() {
        return tagDao.selectAllTag();
    }
}
