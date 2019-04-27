package share;

/**
 * 共享的具体享元类
 */
public class ConcreteShare extends Share{
    @Override
    public void Operation(int i) {
        System.out.println("具体的享元对象" + i);
    }
}
