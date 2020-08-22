package com.zld.demo.service.serviceImpl;

import com.zld.demo.mapper.SingerMapper;
import com.zld.demo.pojo.Singer;
import com.zld.demo.service.SingerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SingerServiceImpl implements SingerService {
    @Resource
    private SingerMapper singerMapper;

    @Override
    public int insertSinger(List<Singer> singerList) {
        int i=0;
        if(singerList.size()>0) {
            i=singerMapper.insertSinger(singerList);
        }
        return i;
    }
}
