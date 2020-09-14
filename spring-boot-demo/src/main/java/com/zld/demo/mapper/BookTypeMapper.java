package com.zld.demo.mapper;

import com.zld.demo.pojo.BookType;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BookTypeMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(BookType record);

    int insertSelective(BookType record);

    BookType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BookType record);

    int updateByPrimaryKey(BookType record);
}