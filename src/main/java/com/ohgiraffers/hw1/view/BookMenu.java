package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.Scanner;

public class BookMenu {

    Scanner sc = new Scanner(System.in);

    public BookMenu(){}

    public void menu(){
        System.out.println("1. 새 도서 추가");
        System.out.println("2. 도서정보 정렬 후 출력");
        System.out.println("3. 도서 삭제");
        System.out.println("4. 도서 검색 출력");
        System.out.println("5. 전체 출력");
        System.out.println("6. 끝내기");

    }
    public BookDTO inputBook(){

        System.out.print("도서 번호 : ");
        int bNum = sc.nextInt();

        System.out.print("도서 제목 : ");
        String bTitle = sc.nextLine();

        System.out.print("도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : ");
        int bCate = sc.nextInt();

        System.out.print("도서 저자 : ");
        String bau = sc.nextLine();

        return new BookDTO(bNum, bCate, bTitle, bau);

    }

//    public String inputBookTitle(){
//
//    }

}
