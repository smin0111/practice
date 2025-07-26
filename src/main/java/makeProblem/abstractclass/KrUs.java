package makeProblem.abstractclass;

public class KrUs extends abstract1 {

    public KrUs(String name) {
        super(name);
    }

    @Override
    public void bloodInfo() {
        System.out.println("한국인의 피가 흐릅니다.");
        System.out.println("미국인의 피가 흐릅니다.");
    }

    @Override
    public void act() {
        System.out.println("노래를 부릅니다.");
        System.out.println("춤을 춥니다.");
    }
}
