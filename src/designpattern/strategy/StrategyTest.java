package designpattern.strategy;

public class StrategyTest {
    public static void main(String[] args) {
        Context contextA, contextB, contextC;
        contextA = new Context(new ConcreteStrategyA());
        contextA.ContextInterface();
        contextB = new Context(new ConcreteStrategyB());
        contextB.ContextInterface();
        contextC = new Context(new ConcreteStrategyC());
        contextC.ContextInterface();
    }
}
