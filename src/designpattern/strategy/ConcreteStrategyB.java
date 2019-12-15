package designpattern.strategy;

/**
 * @author mlx
 */
public class ConcreteStrategyB implements InterfaceStrategy{
    @Override
    public void algorithmInterface() {
        System.out.println("Use strategy B");
    }
}
