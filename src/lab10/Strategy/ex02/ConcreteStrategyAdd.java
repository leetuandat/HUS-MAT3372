package lab10.Strategy.ex02;

public class ConcreteStrategyAdd implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}