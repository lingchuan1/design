package proxy;

/**
 * 代理主题角色，持有对真实主题角色的引用，从而可以在任何时候操作真实主题角色
 */
public class Proxy extends Subject {
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
