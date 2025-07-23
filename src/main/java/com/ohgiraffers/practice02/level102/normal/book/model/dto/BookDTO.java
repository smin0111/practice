package com.ohgiraffers.practice02.level102.normal.book.model.dto;

public class BookDTO {
    private String title;
    private String publisher;
    private String author;
    private int price;
    private double discountRate;

    public BookDTO (){}
    public BookDTO(String title, String publisher, String author){
        this.title = title;
        this.publisher = publisher;
        this.author = author;

    }
    public BookDTO(String title, String publisher, String author, int price, double discountRate){
        this.title = title;
        this.publisher = publisher;
        this.author = author;
        this.price = price;
        this.discountRate = discountRate;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setPrice(int price){
        this.author = author;
    }
    public void setDiscountRate(double discountRate){
        this.discountRate = discountRate;
    }
//  기본 생성자를 이용한 출력문
    public String printInformation() {
        return this.title + ", " + this.publisher + ", " + this.author + ", " + this.price + ", " + this.discountRate;
    }




}
