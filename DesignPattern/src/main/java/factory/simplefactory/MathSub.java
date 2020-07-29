package factory.simplefactory;

public class MathSub implements MathFactory {
    public OperationFactoryImpl createMathOperation() {
        return new OperationSub();
    }
}
