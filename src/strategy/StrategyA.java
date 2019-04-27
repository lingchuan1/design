package strategy;

public class StrategyA extends Strategy {

    @Override
    public double cost(double num) {
        if(num > 0)
            return num * 0.8;
        return 0;
    }
}
