package factory.simplefactory;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleFactoryTest {

    private OperationFactoryImpl operation;
    private static double numA = 6.0;
    private static double numB = 2.0;

    @Test
    public void addTest() {
        MathFactory mathAdd = new MathAdd();
        operation = mathAdd.createMathOperation();
        operation.setNumA(numA);
        operation.setNumB(numB);
        assertEquals(numA + numB, operation.getResult());
    }
}