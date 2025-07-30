package com.ohgiraffers.practice02;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("1.메소드확인============");
        SimpleOperations sim = new SimpleOperations();
        sim.printMessage();

        System.out.println("2.합리턴=============");
        System.out.println(sim.sumNumbers());

        System.out.println("3.홀짝 반환=============");
        if(sim.isEvenNumber() == true){
            System.out.println("짝수입니다");
        }else {
            System.out.println("홀수입니다");
        }

        System.out.println("4.특정 문자의 개수=============");
        System.out.println(sim.countCharacter("Hello World", 'o'));

        System.out.println("5.문자열 뒤집기================");
        System.out.println("\"Hello World\" 를 뒤집은 결과는 : " + sim.reverseString("Hello World"));

        }
    }
