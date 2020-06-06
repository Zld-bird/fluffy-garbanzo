package com.zld.demo.service.serviceImpl;

import com.zld.demo.mapper.SingerMapper;
import com.zld.demo.service.SingerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SingerServiceImpl implements SingerService {
    @Autowired
    private SingerMapper singerMapper;

}
