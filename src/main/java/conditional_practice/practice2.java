package conditional_practice;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        practice2 pb2 = new practice2();
        pb2.problem2();
    }
    public void problem2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 하나를 입력하세요 : ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++){
            sum += i;
        }
        System.out.println("1부터 " + num + " 까지의 합 : " + sum);
    }
}
