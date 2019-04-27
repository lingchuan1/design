package factory;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        FruitFactory f = new AppleFactory();
        Fruit apple = f.getFruit();
        apple.get();

        FruitFactory f2 = new PearFactory();
        Fruit pear = f2.getFruit();
        pear.get();
    }
}
