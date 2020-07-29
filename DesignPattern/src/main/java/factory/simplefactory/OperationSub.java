package factory.simplefactory;

public class OperationSub extends OperationFactoryImpl {
    @Override
    public double getResult() {
        double result;
        result = numA - numB;
        return result;
    }
}
