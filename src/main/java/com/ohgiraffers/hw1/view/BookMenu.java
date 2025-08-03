package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.Scanner;

public class BookMenu {

    Scanner sc = new Scanner(System.in);
    BookManager bM = new BookManager();

    public BookMenu(){}

    public void menu() {

        while (true) {
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서정보 정렬 후 출력");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 검색 출력");
            System.out.println("5. 전체 출력");
            System.out.println("6. 끝내기");
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    bM.addBook(inputBook());
                    break;
                case 2:
                    System.out.println("정렬 방식을 선택해주세요 (1. 오름차순 , 2. 내림차순): ");
                    int type = sc.nextInt();
                    sc.nextLine();

                    if (type == 1){
                        bM.sortedBookList(type);
                        break;
                    }else if (type == 2) {
                        bM.sortedBookList(type);
                        break;
                    } else {
                        System.out.println("번호를 잘못 입력하였습니다.");
                    break;
                    }
                case 6:
                    System.out.println("프로그램을 종료합니다.");
                    return;

                default:
                    System.out.println("잘못된 번호입니다. 다시 선택해주세요.");

            }

        }
    }
    public BookDTO inputBook(){

        System.out.print("도서 번호 : ");
        int bNum = sc.nextInt();
        sc.nextLine();

        System.out.print("도서 제목 : ");
        String bTitle = sc.nextLine();

        System.out.print("도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : ");
        int bCate = sc.nextInt();
        sc.nextLine();

        System.out.print("도서 저자 : ");
        String bau = sc.nextLine();

        return new BookDTO(bNum, bCate, bTitle, bau);

    }

    public String inputBookTitle(){

        System.out.println("도서 제목 : ");
        String BTitle = sc.nextLine();
        return BTitle;
    }

}
