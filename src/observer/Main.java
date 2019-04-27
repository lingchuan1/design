package observer;

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.attach(new Father());
        child.attach(new Mother());
        /**
         * 小明做坏事就会爸爸妈妈就会知道
         */
        child.doBad();
    }
}
