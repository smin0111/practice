package makeProblem.abstractclass;

public class Application {

    public static void main(String[] args) {
        abstract1[] people = {
                new KrUs("한미인"),
                new KrJp("한일인"),
                new UsJp("미일인"),
                new KrUsJp("한미일인")
        };

        for (abstract1 person : people) {
            System.out.println("======== " + person.name + " ========");
            person.introduce();
            person.bloodInfo();
            person.act();
            System.out.println();
        }
    }
}
