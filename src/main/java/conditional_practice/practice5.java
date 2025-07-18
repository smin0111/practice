package conditional_practice;

import java.util.Scanner;

public class practice5 {
    public static void main(String[] args) {
        practice5 pb5 = new practice5();
        pb5.problem5();
    }
    public void problem5(){
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세여 : ");
        String str = sc.nextLine();

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println(i + " : " + ch);
        }

    }
}
