package com.ohgiraffers.practice02.level102.normal.book.run;

import com.ohgiraffers.practice02.level102.normal.book.model.dto.BookDTO;

public class Application {
    public static void main(String[] args) {
        BookDTO book = new BookDTO();
        System.out.println(book.printInformation());

        BookDTO book1 = new BookDTO("자바의 정석", "도우출판", "남궁성");
        System.out.println(book1.printInformation());

        BookDTO book2 = new BookDTO("홍길동전", "활빈당", "허균", 5000000, 0.5);
        System.out.println(book2.printInformation());
    }
}
