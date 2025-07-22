package makeProblem;

public class program123 {

    int error = -1;
    private boolean isOn; // 초기에는 프로그램이 꺼진 false 상태이다.

    public void turnOn() {
        if(isOn){
            System.out.println("이미 프로그램이 켜져있습니다.");
        }else {
            this.isOn = true;
            System.out.println("프로그램을 실행시켰습니다. 이제 코딩할 준비가 완료되었습니다!");
        }
    }

    public void coding(){
        if(isOn) {
            this.error = (int)(Math.random() * 100) + 1;
            System.out.println("코딩중..." + this.error);

        }else {
            System.out.println("현재 프로그램이 종료되어있습니다. 프로그램을 먼저 켜주세요.");
        }
    }

    public void running(){
        if(isOn){
            if(this.error >= 10){
                System.out.println("오류코드 " + this.error +"Exception in thread java.io.FileNotFoundException");

            }else if(this.error <10 && this.error >=0) {
                System.out.println("성공 메세지~~");
            }else
                System.out.println("먼저 코드를 작성해주세요");
        }else {
            System.out.println("현재 프로그램이 종료되어있습니다. 프로그램을 먼저 켜주세요.");
        }
    }

    public void correction(){
        if(isOn) {
            if(this.error >= 10){
                int fix = (int) (Math.random() * 10) + 1;
                this.error -= fix;
                System.out.println("오류코드 " + this.error +"Exception in thread java.io.FileNotFoundException");
            }else if(this.error <10 && this.error >=0) {
                System.out.println("성공 메세지~~");
            }else
                System.out.println("먼저 코드를 작성해주세요");
        }else {
            System.out.println("현재 프로그램이 종료되어있습니다. 프로그램을 먼저 켜주세요.");
        }

    }

    public void turnOff(){
        if(isOn){
            if(this.error >= 0 && this.error < 10){
                System.out.println("프로그램을 종료합니다.");
            }else {
                System.out.println("오류를 수정해주세요.");
            }
        }else {
            System.out.println("이미 프로그램이 종료되어있는 상태입니다.");
        }
    }
}
