package com.zld.demo.mapper;

import com.zld.demo.pojo.Singer;

public interface SingerMapper {
    int insert(Singer record);

    int insertSelective(Singer record);

}