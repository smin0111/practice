package makeProblem.abstractclass;

public class KrJp extends abstract1 {

    public KrJp(String name) {
        super(name);
    }

    @Override
    public void bloodInfo() {
        System.out.println("한국인의 피가 흐릅니다.");
        System.out.println("일본인의 피가 흐릅니다.");
    }

    @Override
    public void act() {
        System.out.println("노래를 부릅니다.");
        System.out.println("악기를 연주합니다.");
    }
}
