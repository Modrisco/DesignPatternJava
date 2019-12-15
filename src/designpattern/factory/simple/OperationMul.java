package designpattern.factory.simple;

public class OperationMul extends AbstractOperation {
    @Override
    public double getResult() {
        double result = 0;
        result = numberA * numberB;
        return result;
    }
}
