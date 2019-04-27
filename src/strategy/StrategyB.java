package strategy;

public class StrategyB extends Strategy{
    @Override
    public double cost(double num) {
        if(num > 0) {
            if (num >= 200)
                return num - 50;
            else
                return num;
        }
        return 0;
    }
}
