package com.runner.blog.dao;

import com.runner.blog.entity.Tourist;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author 郭永江
 * @date 2019/9/30 13:56
 */
@Mapper
public interface TouristDao {

    int addTourist(Tourist tourist);

    int selectip(@Param("ipAddress") String ipAddress,@Param("macAddress")String macAddress);

}
