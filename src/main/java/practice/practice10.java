package practice;

import java.util.Scanner;

public class practice10 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("나이가 어떻게 되세요? : ");
    int age = sc.nextInt();

    if(age > 19){
        System.out.println("판매 가능합니다");
    } else {
        System.out.println(" 팬매 불가능 합니다. 음료 코너에서 골라주세요.");
    }
}
}

