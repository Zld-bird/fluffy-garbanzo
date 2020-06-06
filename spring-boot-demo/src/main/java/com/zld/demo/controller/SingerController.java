package com.zld.demo.controller;

import com.zld.demo.pojo.Singer;
import com.zld.demo.service.SingerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("singer")
public class SingerController {
    @Autowired
    private SingerService singerService;

    public void InsertSinger(){

    }
}
