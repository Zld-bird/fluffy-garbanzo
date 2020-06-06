package com.zld.demo.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class BookManagement {
    private Integer id;

    private String bookName;

    private String author;

    private BigDecimal bookPrice;

    private Integer bookTypeId;

    private Date publishDate;

    private String publishHouse;

    private Date lendDate;

    private String lendMan;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName == null ? null : bookName.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public BigDecimal getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(BigDecimal bookPrice) {
        this.bookPrice = bookPrice;
    }

    public Integer getBookTypeId() {
        return bookTypeId;
    }

    public void setBookTypeId(Integer bookTypeId) {
        this.bookTypeId = bookTypeId;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public String getPublishHouse() {
        return publishHouse;
    }

    public void setPublishHouse(String publishHouse) {
        this.publishHouse = publishHouse == null ? null : publishHouse.trim();
    }

    public Date getLendDate() {
        return lendDate;
    }

    public void setLendDate(Date lendDate) {
        this.lendDate = lendDate;
    }

    public String getLendMan() {
        return lendMan;
    }

    public void setLendMan(String lendMan) {
        this.lendMan = lendMan == null ? null : lendMan.trim();
    }
}