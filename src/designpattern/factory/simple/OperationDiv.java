package designpattern.factory.simple;

public class OperationDiv extends AbstractOperation {
    @Override
    public double getResult() {
        if (numberB == 0) {
            throw new RuntimeException("Cannot be divided by 0");
        }
        double result = 0;
        result = numberA / numberB;
        return result;
    }
}
