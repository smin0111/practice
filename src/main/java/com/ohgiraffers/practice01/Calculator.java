package com.ohgiraffers.practice01;

public class Calculator {


    public void checkMethod() {
        System.out.println("메소드 호출 확인");
    }


    int sum;
    public int sum1to10() {
        for(int i = 1; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }

    public void checkMaxNumber(int num1, int num2) {
        int max;
        if(num1 >= num2) {
            System.out.println("두 수 중 큰 수는 " + num1 + "이다.");
        } else {
            System.out.println("두 수 중 큰 수는 " + num2 + "이다.");
        }
    }


    public int sumTwoNumber(int num1, int num2) {
        int sum;
        sum = num1 + num2;
        return sum;
    }


    public int minusTwoNumber(int num1, int num2) {
        int sum;
        sum = num1 - num2;
        return sum;
    }


}

