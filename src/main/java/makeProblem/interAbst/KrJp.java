package makeProblem.interAbst;

public class KrJp extends Person {
    public KrJp(String name) {
        super(name);
    }

    @Override
    public void bloodInfo() {
        System.out.println("한국인의 피가 흐릅니다.");
        System.out.println("일본인의 피가 흐릅니다.");
    }
}
