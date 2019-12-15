package designpattern.factory.simple;

/**
 * @author mlx
 */
public class OperationTest {
    public static void main(String[] args) {
        AbstractOperation operation;
        String operator = "/";
        operation = OperationFactory.createOperation(operator);
        operation.numberA = 3;
        operation.numberB = 0;
        System.out.println(operation.getResult());
    }
}
