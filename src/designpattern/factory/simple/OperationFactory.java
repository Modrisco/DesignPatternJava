package designpattern.factory.simple;

/**
 * @author mlx
 */
public class OperationFactory {
    public static AbstractOperation createOperation(String operator) {
        AbstractOperation operation;
        switch (operator) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
            default:
                throw new RuntimeException("Unsupported operation");
        }
        return operation;
    }
}
