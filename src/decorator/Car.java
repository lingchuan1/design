package decorator;

/**
 * 装饰模式。Car是抽象组件角色，是被装饰类和装饰类的父接口。RunCar是抽象组件的实现类。CarDecorator也是抽象组件的实现类，同时包含一个组件的引用，并定义
 * 了与抽象组件一致的接口。FlycarDecorator和SwimcarDecorator是抽象装饰角色CarDecorator的实现类，负责具体的装饰。
 */
public interface Car {
    void show();
}
