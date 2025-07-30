package com.ohgiraffers.practice02;

import java.util.Scanner;

public class SimpleOperations {
    //함수 호출 메서드-------------------------
    public void  printMessage(){
        System.out.println("함수 호출 확인용 메서드");
    }
    //함수 호출 메서드 끝-----------------------
    //숫자 합 메서드--------------------------
    public int sumNumbers(){

        System.out.println("start 부터 end까지의 숫자들의 합을 리턴함 ");
        Scanner sc = new Scanner(System.in);
        System.out.print("start 숫자 입력 :");
        int start = sc.nextInt();

        System.out.print("end 숫자 입력 :");
        int end = sc.nextInt();

        int result = 0;
        for(int i = start; i <= end; i++){
            result += i;
        }

        System.out.print(start + "부터 " + end + "까지의 합은 : ");
        return result;
    }

    //---------------숫자 합메서드 끝----------------
    //---------------홀짝 반환 메서드----------------

    public boolean isEvenNumber() {
        System.out.print("정수를 입력하세요 :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        boolean isTrue =  (num % 2 == 0)? true : false;

        System.out.print(num + "은(는) ");
        return isTrue;
    }

    //--------------홀짝 반환 메서드 끝-----------------
    //--------------문자 갯수 반환 -------------------

    public int countCharacter(String str, char ch){


        int count = 0;
        for(int i = 0; i < str.length(); i++){
           if( ch == str.charAt(i)) {
               count++;
           }
        }
        System.out.print(str + "에서 " + ch + "의 개수는 : ");
       return count;
    }
    //--------------문자 갯수 반환끝 -------------------
    //--------------문자열 뒤집기 -----------------

    public String reverseString(String str){

        StringBuilder sb1 = new StringBuilder(str);

        return sb1.reverse().toString();
    }


}
