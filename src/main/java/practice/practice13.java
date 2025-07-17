package practice;

import java.util.Scanner;

public class practice13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("월 급여 입력 : ");
        int money = sc.nextInt();
        System.out.print("매출액 입력 : ");
        int sales = sc.nextInt();

        int total;
        int bonus;

        if (sales >= 50000000){
            bonus = 5;
            total = money + (sales * bonus /100);
        } else if (sales >=30000000) {
            bonus = 3;
            total = money + (sales * bonus /100);
        }else if (sales >=10000000) {
            bonus = 1;
            total = money + (sales * bonus /100);
        }else {
            bonus = 0;
         total = money;
        }
        System.out.println("=====================");
        System.out.println("매출액 : " + sales);
        System.out.println("보너스율 : " + bonus + "%");
        System.out.println("월 급여 : " + money);
        System.out.println("보너스 금액 : " + sales * bonus / 100);
        System.out.println("=====================");
        System.out.println("총 급여 : "+ total);


    }

}
