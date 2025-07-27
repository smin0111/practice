package makeProblem.interAbst;

public class Application {
    public static void main(String[] args) {
        // 공통 행동 인스턴스 생성 (재사용 가능)
        Sing sing = new Sing();
        Dance dance = new Dance();
        Play play = new Play();

        // 사람 객체 생성
        Person p1 = new KrUs("한미인");
        p1.setSing(sing);
        p1.setDanceAction(dance);

        Person p2 = new KrJp("한일인");
        p2.setSing(sing);
        p2.setPlayAction(play);

        Person p3 = new UsJp("미일인");
        p3.setDanceAction(dance);
        p3.setPlayAction(play);

        Person p4 = new KrUsJp("한미일인");
        p4.setSing(sing);
        p4.setDanceAction(dance);
        p4.setPlayAction(play);

        // 실행
        Person[] people = {p1, p2, p3, p4};
        for (Person p : people) {
            System.out.println("======= " + p.name + " =======");
            p.introduce();
            p.bloodInfo();
            p.act();
            System.out.println();
        }
    }
}
