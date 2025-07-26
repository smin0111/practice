package makeProblem.abstractclass;

public abstract class abstract1 {

        protected String name;

        public abstract1(String name) {
            this.name = name;
        }

        public void introduce() {
            System.out.println("안녕하세요, 저는 " + name + "입니다.");
        }

        // 하위 클래스에서 필수 구현
        public abstract void bloodInfo();
        public abstract void act();
    }

