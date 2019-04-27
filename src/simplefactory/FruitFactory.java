package simplefactory;

/**
 * 简单工厂模式：专门定义一个类来负责创建其他类的实例，被创建的实例通常都具有共同的父类
 */
public class FruitFactory {
//    public static Fruit getAppple(){
//        return new Apple();
//    }
//    public static Fruit getBanana(){
//        return new Banana();
//    }
    public static Fruit getType(String type) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class fruit = Class.forName(type);
        return (Fruit) fruit.newInstance();
    }
}
