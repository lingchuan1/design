package factory;

/**
工厂方法模式:又称为多态工厂模式，定义一个创建产品对象的工厂接口，将实际创建工作推迟到子类当中。
 符合“开放-关闭”原则，当增加一个pear类工厂时，不需要修改已有代码，只需要增添新的代码
 */
public interface FruitFactory {

    Fruit getFruit();
}
