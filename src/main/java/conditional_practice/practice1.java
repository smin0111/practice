package conditional_practice;

import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
    practice1 pb = new practice1();
    pb.problem1();
    }
    public void problem1(){
        int i = 1;
        int sum = 0;
        while (i<=100){
            sum += i;
            i++;
        }
        System.out.println("1부터 100까지의 합은 : " + sum);
    }
}
