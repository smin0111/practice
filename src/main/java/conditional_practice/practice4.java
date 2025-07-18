package conditional_practice;

import java.util.Scanner;

public class practice4 {
    public static void main(String[] args) {
        practice4 pb4 = new practice4();
        pb4.problem4();
    }
    public void problem4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요 : ");
        int num = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i++){
            if (i % 2 == 0){
                sum += i;
            }
        }
        System.out.println("1부터 " + num + "까지 짝수의 합 : " +sum);

    }
}
