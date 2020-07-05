package com.zld.demo.controller;

import com.zld.demo.pojo.BookManagement;
import com.zld.demo.service.BookManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("BookManager")
public class BookManagerController {
    @Autowired
    private BookManagerService bookManagerService;

    /**
     * 添加图书
     * @param bookManagement
     * @return
     */
    @RequestMapping("addBook")
    public String addBook(@RequestBody BookManagement bookManagement){
        int i=bookManagerService.addBook(bookManagement);
        if(i!=0){
            return "添加成功";
        }
        return "添加失败";
    }

    @RequestMapping("selectBook")
    public String selectBook(Model model){
        List<BookManagement> list=bookManagerService.selectBook();
        model.addAttribute("list", list);
        return "index";
    }
}
