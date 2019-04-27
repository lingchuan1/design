package strategy;

/**
 * context是环境角色，持有对Strategy类的引用，Strategy是抽象策略角色，具体抽象角色继承于Strategy类
 */
public class Context {
    Strategy strategy;
    public Context(Strategy strategy){
        this.strategy = strategy;
    }
    public double cost(double num){
        return strategy.cost(num);
    }
}
