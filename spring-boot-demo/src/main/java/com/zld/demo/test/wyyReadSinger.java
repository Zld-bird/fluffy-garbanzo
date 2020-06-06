package com.zld.demo.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.io.*;

/**
 * 读取json文件
 */
public class wyyReadSinger {

    public static void main(String[] args) {
        String path = "D://singers.json";
        String s = readJsonFile(path);
        //JSONObject jobj = JSON.parseObject(s);
        JSONObject jsonObject = JSON.parseObject(s);
        jsonObject.getJSONObject("uid");

        JSONArray links = jsonObject.getJSONArray("links");

        for (int i = 0; i < links.size(); i++) {
            JSONObject key1 = (JSONObject) links.get(i);
            String name = (String) key1.get("name");
            String url = (String) key1.get("url");
            System.out.println(name);
            System.out.println(url);
        }

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
