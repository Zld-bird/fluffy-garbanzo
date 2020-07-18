package com.zld.demo.mapper;

import com.zld.demo.pojo.Singer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SingerMapper {
    int insertSinger(@Param("singerList") List<Singer> record);

    int insertSelective(Singer record);

}