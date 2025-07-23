package makeProblem;

import java.util.Scanner;

public class makeproblem {
    public static void main(String[] args) {
        /* 추상화
        *
        * 시스템 요구사항
        *  1. 개발자는 프로그램 켜기, 코딩, 코드 실행, 오류 수정, 프로그램 종료를 할 수 있다.
        *  2. 프로그램은 프로그램 켜기, 코드실행, 오류 출력, 성공출력, 프로그램 종료를 할 수 있다.
        *  3. 프로그램은 처음에 꺼진 상태로 대기하고 있는다.
        *  4. 개발자가 먼저 프로그램을 켠다 이미 프로그램이 켜져있을 경우 프로그램을 킬수 없다.
        *  5. 개발자가 코딩을 하면 프로그램을 입력중이라는 신호를 받는ㄷ.
        *  6. 개발자가 코드실행을 하면 오류 출력, 또는 성공을 출력한다.
        *  7. 오류가 출력되면 개발자는 오류 수정을 해야한다.
        *  8. 오류가 수정되지 않으면 프로그램을 종료할 수 없다.
        *  9. 코드를 성공적으로 출력했을 경우 프로그램을 종료할 수 있다
        *  10. 프로그램을 종료하면 개발자는 더 이상 코딩을 진행할 수 없다.
        *  */
        /* 프로그램 설게
        *  1. 필요한 객체 도출
        * - 플레이어(사용자), 개발자, 프로그램
        *
        *  2. 객체간 상호작용
        *  - 개발자가 수신할 수 있는 메세지 (개발자가 해야 하는 일)
        *  1. 프로그램 켜기
        *  2. 코딩하기
        *  3. 코드 실행하기
        *  4. 오류 수정하기
        *  5. 프로그램 종료하기
        *
        *  - 프로그램이 수신할 수 있는 메세지(프로그램이 해여 하는 일)
        *  1. 프로그램 켜기
        *  2. 코딩중 출력하기
        *  3. 오류 출력하기
        *  4. 성공 메세지 출력하기
        *  5. 프로그램 종료하기
        *
        * */
        developer user = new developer();

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("==============개발자 컴퓨터==============");
            System.out.println("1. 프로그램 켜기");
            System.out.println("2. 코딩");
            System.out.println("3. 코드실행");
            System.out.println("4. 오류수정");
            System.out.println("5. 프로그램 끄기");
            System.out.println("9. 컴퓨터 끄기");
            System.out.print("메뉴 선택 : ");
            int no = sc.nextInt();

            switch (no){
                case 1 : user.programTurnOn(); break;
                case 2 : user.programCoding(); break;
                case 3 : user.programRunning(); break;
                case 4 : user.programCorrection(); break;
                case 5 : user.programTurnOff(); break;
                case 9 :
                    System.out.println("컴퓨터가 종료되었습니다."); break;
                default:
                    System.out.println("잘못된 번호를 선택하셧습니다.");break;
            }
            if(no == 9) {
                break;
            }
        }

    }
}
