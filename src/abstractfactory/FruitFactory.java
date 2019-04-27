package abstractfactory;

/**
抽象工厂方法模式:一个工厂等级结构可以创建出分属于不同产品等级结构的一个产品族中的所有对象
 此例中，有apple,banana两个产品等级结构，NorthApple,NorthBanana是一个产品族，SouthApple,SouthBanana是一个产品族，有两个产品族
 一般而言，有多少个产品等级结构，就会在工厂角色中发现多少个工厂方法。每个产品等级结构中有多少具体产品，就有多少个产品族，也就会在工厂等级结构中发现多少个具体工厂。
 */
public interface FruitFactory {

    Fruit getApple();
    Fruit getBanana();
}
