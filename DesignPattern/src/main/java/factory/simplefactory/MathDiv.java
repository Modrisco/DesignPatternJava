package factory.simplefactory;

public class MathDiv implements MathFactory {
    public OperationFactoryImpl createMathOperation() {
        return new OperationDiv();
    }
}
