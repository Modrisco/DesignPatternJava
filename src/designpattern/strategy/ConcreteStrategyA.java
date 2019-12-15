package designpattern.strategy;

/**
 * @author mlx
 */
public class ConcreteStrategyA implements InterfaceStrategy{
    @Override
    public void algorithmInterface() {
        System.out.println("Use strategy A");
    }
}
