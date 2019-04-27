package adapter;

/**
 * 适配器类，持有对Adaptee的引用，实现客户端期望的接口，重写request方法，调用adaptee的方法
 */
public class Adapter implements Target {

    Adaptee adaptee = new Adaptee();
    @Override
    public void request() {
        adaptee.superReqest();
    }
}
