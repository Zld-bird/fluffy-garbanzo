package com.zld.demo.mapper;

import com.zld.demo.pojo.BookManagement;

import java.util.List;

public interface BookManagementMapper {
    int deleteByPrimaryKey(Integer id);

    int insertBook(BookManagement record);

    int insertSelective(BookManagement record);

    List<BookManagement> selectAll();

    BookManagement selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BookManagement record);

    int updateByPrimaryKey(BookManagement record);
}