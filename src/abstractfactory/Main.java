package abstractfactory;

public class Main {
    public static void main(String[] args) {
        FruitFactory ff = new NorthFactory();
        Fruit appleN = ff.getApple();
        appleN.get();

        Fruit bananaN = ff.getBanana();
        bananaN.get();

        FruitFactory ff2 = new SouthFactory();
        Fruit appleS = ff2.getApple();
        appleS.get();

        Fruit bananaS = ff2.getBanana();
        bananaS.get();
    }
}
