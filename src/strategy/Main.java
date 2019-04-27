package strategy;

//使用策略者模式
public class Main {
    public static void main(String[] args) {
        Context context = new Context(new StrategyA());
        System.out.println("使用策略A消费"+context.cost(250.0));
        context = new Context(new StrategyB());
        System.out.println("使用策略B消费"+context.cost(250.0));

    }
}
