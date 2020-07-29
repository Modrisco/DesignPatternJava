package factory.simplefactory;

public class OperationDiv extends OperationFactoryImpl {
    @Override
    public double getResult() {
        double result;
        result = numA / numB;
        return result;
    }
}
