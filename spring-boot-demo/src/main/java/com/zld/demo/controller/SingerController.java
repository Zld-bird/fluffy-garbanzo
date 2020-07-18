package com.zld.demo.controller;

import com.zld.demo.pojo.Singer;
import com.zld.demo.service.SingerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("singer")
public class SingerController {
    @Autowired
    private SingerService singerService;

    @RequestMapping(value = "/insertSinger" ,method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public String InsertSinger(@RequestBody List<Singer> singerList){
        int i=singerService.insertSinger(singerList);
        if(i!=0){
            return "添加成功";
        }
        return "添加失败";
    }
}
