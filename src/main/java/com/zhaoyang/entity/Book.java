package com.zhaoyang.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "book", schema = "ebook")
public class Book {
    private String title;
    private int bid;
    private int state;
    private String image;
    private String isbn;
    private String author;
    private Double price;
    private Integer inventory;
    private String tranch;
    private String introduction;
    private List<Orderitem> orderitems;
    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Id
    @Column(name = "bid")
    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    @Basic
    @Column(name = "image")
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Basic
    @Column(name = "ISBN")
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Basic
    @Column(name = "state")
    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Basic
    @Column(name = "author")
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String writer) {
        this.author = writer;
    }

    @Basic
    @Column(name = "price")
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Basic
    @Column(name = "inventory")
    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    @Basic
    @Column(name = "tranch")
    public String getTranch() {
        return tranch;
    }

    public void setTranch(String tranch) {
        this.tranch = tranch;
    }

    @Basic
    @Column(name = "introduction")
    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book that = (Book) o;

        if (bid != that.bid) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (image != null ? !image.equals(that.image) : that.image != null) return false;
        if (isbn != null ? !isbn.equals(that.isbn) : that.isbn != null) return false;
        if (author != null ? !author.equals(that.author) : that.author != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (inventory != null ? !inventory.equals(that.inventory) : that.inventory != null) return false;
        if (tranch != null ? !tranch.equals(that.tranch) : that.tranch != null) return false;
        if (introduction != null ? !introduction.equals(that.introduction) : that.introduction != null) return false;

        return true;
    }
}
