package designpattern.strategy;

public class Context {
    private InterfaceStrategy strategy;
    public Context (InterfaceStrategy strategy) {
        this.strategy = strategy;
    }

    public void ContextInterface() {
        strategy.algorithmInterface();
    }
}
