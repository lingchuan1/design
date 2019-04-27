package simplefactory;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Fruit apple = FruitFactory.getType("test1.Apple");
        Fruit banana = FruitFactory.getType("test1.Banana");
        apple.get();
        banana.get();
    }
}
