package bridge;

/**
 * 桥接模式，将car和engine分离，使他们都可以独立地发生变化
 */
public class Main {
    public static void main(String[] args) {
        Car bus = new Bus(new Engine2000());
        bus.installEngine();
    }
}
