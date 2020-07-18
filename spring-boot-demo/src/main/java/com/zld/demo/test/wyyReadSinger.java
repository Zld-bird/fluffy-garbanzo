package com.zld.demo.test;

import com.alibaba.fastjson.JSON;
import com.zld.demo.pojo.Singer;
import com.zld.demo.service.SingerService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;


import java.io.*;
import java.util.*;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;


/**
 * 读取json文件
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment =SpringBootTest.WebEnvironment.MOCK,classes = wyyReadSinger.class)
@AutoConfigureMockMvc
public class wyyReadSinger {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private SingerService singerService;

    @Test
    public void test(){
        List singer = singer("D://面试//ss1.json");
        try {
            MvcResult mvcResult = mockMvc.perform(
                    post("/singer/insertSinger")
                            .contentType(MediaType.APPLICATION_JSON)
                            .content(JSON.toJSONString(singer)))
                    .andReturn();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public List singer(String path) {
        String s = readJsonFile(path);
        System.out.println(s);
        String[] split = s.split("\n|\r");
        List list=new ArrayList();
        for (String ss:split
             ) {
            if(!ss.isEmpty()) {
                Map<String, Object> parse = (Map<String, Object>) JSON.parse(ss);
                Singer singer = new Singer();
                for (Map.Entry<String, Object> m : parse.entrySet()) {
                    System.out.println(m);
                    String key = m.getKey();
                    System.out.println(key);
                    if("uid".equals(m.getKey())){
                        singer.setUid((String) m.getValue());
                    }
                    if("name".equals(m.getKey())){
                        singer.setSname((String)m.getValue());
                    }
                }
                list.add(singer);
            }
        }
        return list;
    }

    public static String readJsonFile(String fileName) {
        String jsonStr = "";
        try {
            File jsonFile = new File(fileName);
            FileReader fileReader = new FileReader(jsonFile);

            Reader reader = new InputStreamReader(new FileInputStream(jsonFile),"utf-8");
            int ch = 0;
            StringBuffer sb = new StringBuffer();
            while ((ch = reader.read()) != -1) {
                sb.append((char) ch);
            }
            fileReader.close();
            reader.close();
            jsonStr = sb.toString();
            return jsonStr;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
