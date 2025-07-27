package makeProblem.interAbst;

public abstract class Person {
    protected String name;

    protected Sing sing;
    protected Dance dance;
    protected Play play;

    public Person(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println("안녕하세요, 저는 " + name + "입니다.");
    }

    public abstract void bloodInfo();

    public void act() {
        if (sing != null) sing.sing();
        if (dance != null) dance.dance();
        if (play != null) play.play();
    }

    public void setSing(Sing action) {
        this.sing = action;
    }

    public void setDanceAction(Dance action) {
        this.dance = action;
    }

    public void setPlayAction(Play action) {
        this.play = action;
    }
}

