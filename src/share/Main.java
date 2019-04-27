package share;

/**
 * 享元模式：通过与其他类似对象共享数据来减少内存占用
 */
public class Main {
    public static void main(String[] args) {
        ShareFactory factory = new ShareFactory();
        Share a = factory.getShare("A");
        Share b = factory.getShare("A");
        a.Operation(1);
        b.Operation(2);
        System.out.println(a == b);

        Share c = new ConcreteUnShare();
        c.Operation(3);
    }
}
