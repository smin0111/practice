package arr_practice;

import java.util.Scanner;

public class arrPractice2 {
    public static void main(String[] args) {
        String[] arr = {"딸기", "바나나", "복숭아", "키위", "사과"};
        System.out.println("0부터 4까지의 정수를 입력해주세요");
        Scanner sc = new Scanner(System.in);
        int output = sc.nextInt();

        if(output >= 0 && output <= 4){
            System.out.println(arr[output]);

        }else {
            System.out.println("준비된 과일이 없습니다.");
        }
    }
}
