package proxy;

/**
 * 代理模式，主要用在一个客户不想或不能直接引用一个对象，代理对象可以在客户端和目标对象之间起到中介的作用
 */
public class Main {
    public static void main(String[] args) {
        Subject subject = new Proxy();
        subject.request();

    }
}
