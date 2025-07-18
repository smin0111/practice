package conditional_practice;

import java.util.Scanner;

public class practice7 {
    public static void main(String[] args) {
        practice7 pb7 = new practice7();
        pb7.problem7();
    }
    public void problem7(){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++){
            if (i % 2 == 0){
                System.out.print("마");
            }else {
                System.out.print("토");
            }
        }
    }
}
