package proxy;

/**
 * 代理主题角色，持有对真实主题角色的引用，从而可以在任何时候操作真实主题角色
 * 静态代理：代理类和原始类的关系在运行前就已经确定
 * 缺点：如果要代理的方法很多，就要为每一种方法都进行代理。如果增加一个方法，除了实现类
 * 需要实现这个方法外，所有的代理类也要实现这个方法
 */
public class Proxy implements Subject {
    private RealSubject realSubject;
    @Override
    public void request() {
        beforeRequest();
        if(realSubject == null)
            realSubject = new RealSubject();
        realSubject.request();
        afterRequest();
    }
    public void beforeRequest(){
        System.out.println("do sth before request");
    }
    public void afterRequest(){
        System.out.println("do sth after request");
    }
}
