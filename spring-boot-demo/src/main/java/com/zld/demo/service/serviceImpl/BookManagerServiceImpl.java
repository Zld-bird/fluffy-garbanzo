package com.zld.demo.service.serviceImpl;

import com.zld.demo.mapper.BookManagementMapper;
import com.zld.demo.pojo.BookManagement;
import com.zld.demo.service.BookManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookManagerServiceImpl implements BookManagerService {
    @Autowired(required = false)
    private BookManagementMapper bookManagementMapper;

    @Override
    public int addBook(BookManagement bookManagement) {
        //String id = UUID.randomUUID().toString();
        //bookManagement.setId(id);
        int i = bookManagementMapper.insertBook(bookManagement);
        return i;
    }

    @Override
    public List<BookManagement> selectBook() {
        return bookManagementMapper.selectAll();
    }
}
