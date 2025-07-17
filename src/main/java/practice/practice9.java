package practice;

import java.util.Scanner;

public class practice9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("몇월 생이신가요? : ");
        int month = sc.nextInt();
        System.out.print("며칠에 태어나셨나요? : ");
        int day = sc.nextInt();


        if(month >= 1 && month <= 6) {
            if (day >= 1 && day <= 15) {
                System.out.println(name + "의 선물은 배민 쿠폰입니다");
            }
        }else if (month >= 7 && month <= 12) {
                if(day >=16 && day <= 31) {
                    System.out.println(name + "의 선물은 스타벅스 커피입니다.");
                }
            } else {
                System.out.println(name + "의 선물은 사탕 입니다.");
            }

    }
}
