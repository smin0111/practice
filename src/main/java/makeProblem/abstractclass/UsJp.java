package makeProblem.abstractclass;

public class UsJp extends abstract1 {

    public UsJp(String name) {
        super(name);
    }

    @Override
    public void bloodInfo() {
        System.out.println("미국인의 피가 흐릅니다.");
        System.out.println("일본인의 피가 흐릅니다.");
    }

    @Override
    public void act() {
        System.out.println("춤을 춥니다.");
        System.out.println("악기를 연주합니다.");
    }
}
