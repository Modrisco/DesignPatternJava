package designpattern.factory.simple;

/**
 * @author mlx
 */
public class OperationSub extends AbstractOperation {
    @Override
    public double getResult() {
        double result = 0;
        result = numberA + numberB;
        return result;
    }
}
