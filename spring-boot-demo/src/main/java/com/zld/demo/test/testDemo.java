package com.zld.demo.test;

import net.sf.json.JSON;
import com.zld.demo.pojo.BookManagement;
import net.sf.json.JSONArray;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;


import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 测试类
 */
public class testDemo {
    public static void main(String[] args) throws IOException {
        BookManagement bookManagement = new BookManagement();
        String url = "http://127.0.0.1:8090/BookManager?bookManagement";
        HttpClient httpClient = new DefaultHttpClient();
        HttpPost httpPost = new HttpPost(url);

        bookManagement.setId(1);
        bookManagement.setAuthor("罗贯中");
        bookManagement.setBookName("三国演义");
        BigDecimal bigDecimal = new BigDecimal(5678.6789);
        bookManagement.setBookPrice(bigDecimal);
        bookManagement.setBookTypeId(1);
        bookManagement.setLendDate(null);
        bookManagement.setLendMan(null);
        /*SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
         */
        Date date = new Date(1890 - 02 - 23);
        //String format = simpleDateFormat.format(date);
        bookManagement
                .setPublishDate(date);
        bookManagement.setPublishHouse("人民教育出版社");

        JSONArray jsonArray = JSONArray.fromObject(bookManagement);
        System.out.println(jsonArray.toString());
        StringEntity entity = new StringEntity(jsonArray.toString(), "utf-8");
        entity.setContentEncoding("UTF-8");
        entity.setContentType("application/json");
        httpPost.setEntity(entity);
        HttpResponse response = httpClient.execute(httpPost);

    }
}
