package makeProblem.interfaceimplements;

public class Application {
    public static void main(String[] args) {

        System.out.println("=========한미인========");
        KrUs person1 = new KrUs();
        person1.bloodKr();
        person1.bloodUs();
        person1.speakKr();
        person1.speakUs();
        person1.sing();
        person1.dance();
        System.out.println();

        System.out.println("=========한일인========");
        KrJp person2 = new KrJp();
        person2.bloodKr();
        person2.bloodJp();
        person2.speakKr();
        person2.speakJp();
        person2.sing();
        person2.play();
        System.out.println();

        System.out.println("===========미일인==========");
        UsJp person3 = new UsJp();
        person3.bloodUs();
        person3.bloodJp();
        person3.speakUs();
        person3.speakJp();
        person3.dance();
        person3.play();
        System.out.println();

        System.out.println("==========한미일인========");
        KrUsJp person4 = new KrUsJp();
        person4.bloodKr();
        person4.bloodUs();
        person4.bloodJp();
        person4.speakKr();
        person4.speakUs();
        person4.speakJp();
        person4.sing();
        person4.dance();
        person4.play();




    }
}
