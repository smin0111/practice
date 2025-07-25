package makeProblem.interfaceimplements;

public class KrUsJp implements Interface1, Interface2, Interface3{

    @Override
    public void bloodKr() {
        System.out.println("한국인의 피가 흐릅니다");
    }

    @Override
    public void speakKr() {
        System.out.println("한국말을 합니다");
    }

    @Override
    public void sing() {
        System.out.println("한국인의 피가 흐르면 노래를 부릅니다.");
    }

    @Override
    public void bloodUs() {
        System.out.println("미국인의 피가 흐릅니다");
    }

    @Override
    public void speakUs() {
        System.out.println("영어를 합니다.");
    }

    @Override
    public void dance() {
        System.out.println("미국인의 피가 흐르면 춤을 춥니다.");
    }
    @Override
    public void bloodJp() {
        System.out.println("일본인의 피가 흐릅니다.");
    }

    @Override
    public void speakJp() {
        System.out.println("일본어를 합니다.");
    }

    @Override
    public void play() {
        System.out.println("일본인의 피가 흐르면 노래를 부릅니다.");
    }
}
