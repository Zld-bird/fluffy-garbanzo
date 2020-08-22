package com.zld.demo.mapper;

import com.zld.demo.pojo.Singer;

import java.util.List;

public interface SingerMapper {
    int insertSinger(List<Singer> list);

    int insertSelective(Singer record);

}