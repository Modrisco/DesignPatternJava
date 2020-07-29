package factory.simplefactory;

public class OperationAdd extends OperationFactoryImpl {
    @Override
    public double getResult() {
        double result;
        result = numA + numB;
        return result;
    }
}
