package practice;

import java.util.Scanner;

public class practice12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("성실 점수 : ");
        int num1 = sc.nextInt();
        System.out.print("서비스 점수 : ");
        int num2 = sc.nextInt();
        System.out.print("미소 점수 : ");
        int num3 = sc.nextInt();

        int average = (num1 + num2 + num3) / 3;

        if (average >= 60){
            if (num1 >= 40 && num2 >= 40 && num3 >= 40){
                System.out.println("합격입니다");
            }else if (num1 < 40){
                System.out.println("성실 점수 미달로 불합격입니다,");
            }else if (num2 < 40){
                System.out.println("서비스 점수 미달로 불합격입니다,");
            }else if (num3 < 40) {
                System.out.println("미소 점수 미달로 불합격입니다,");
            }
        }else {
            System.out.println("평균 점수 미달로 불합격입니다.");
        }
    }
}
