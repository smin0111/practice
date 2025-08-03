package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.view.BookMenu;

public class Application {
    public static void main(String[] args) {
        BookMenu menu = new BookMenu();  // BookMenu 객체 생성
        menu.menu();
    }
}
