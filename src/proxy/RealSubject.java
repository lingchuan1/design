package proxy;

/**
 * 真实主题角色
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("real request");
    }
}
