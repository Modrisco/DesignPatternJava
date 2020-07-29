package factory.simplefactory;

public class MathMul implements MathFactory {

    public OperationFactoryImpl createMathOperation() {
        return new OperationMul();
    }
}
