package proxy;

/**
 * 真实主题角色
 */
public class RealSubject extends Subject {
    @Override
    public void request() {
        System.out.println("real request");
    }
}
