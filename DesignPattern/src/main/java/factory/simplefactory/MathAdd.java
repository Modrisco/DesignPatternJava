package factory.simplefactory;

public class MathAdd implements MathFactory {
    public OperationFactoryImpl createMathOperation() {
        return new OperationAdd();
    }
}
