package practice;

import java.util.Scanner;

public class practice11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("당첨 번호가 어떻게 되세요? : ");
        int num = sc.nextInt();

        if(num % 2 == 0 && num >=1 && num <= 10){
            System.out.println("짝수네요, 모자 선물입니다!");
        } else if (num >=1 && num <= 10 && num % 2 != 0) {
            System.out.println(" 홀수네요, 인형 선물입니다.");
        } else {
            System.out.println("당첨 번호는 1~10 사이에만 있어요.");
    }
}
}
