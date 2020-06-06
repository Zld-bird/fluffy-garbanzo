package com.zld.demo.service;

import com.zld.demo.pojo.BookManagement;

import java.util.List;

public interface BookManagerService {
    int addBook(BookManagement bookManagement);

    List<BookManagement> selectBook();
}
