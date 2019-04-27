package share;

/**
 * 不共享的具体享元类
 */
public class ConcreteUnShare extends Share{
    @Override
    public void Operation(int i) {
        System.out.println("不共享的享元对象" + i);
    }
}
