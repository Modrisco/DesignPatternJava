package factory.simplefactory;

public class OperationMul extends OperationFactoryImpl {
    @Override
    public double getResult() {
        double result;
        result = numA * numB;
        return result;
    }
}
