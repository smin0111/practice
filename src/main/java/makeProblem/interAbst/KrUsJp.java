package makeProblem.interAbst;

public class KrUsJp extends Person {
    public KrUsJp(String name) {
        super(name);
    }

    @Override
    public void bloodInfo() {
        System.out.println("한국인의 피가 흐릅니다.");
        System.out.println("미국인의 피가 흐릅니다.");
        System.out.println("일본인의 피가 흐릅니다.");
    }
}
