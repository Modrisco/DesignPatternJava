package factory.simplefactory;

//import static org.junit.jupiter.api.Assertions.*;

class SimpleFactoryTest {

    public static void main(String[] args) {
        OperationFactoryImpl operation;

        MathFactory mathAdd = new MathAdd();
        operation = mathAdd.createMathOperation();
        operation.setNumA(3);
        operation.setNumB(2);
        System.out.println(operation.getResult());

        MathFactory mathSub = new MathSub();
        operation = mathSub.createMathOperation();
        operation.setNumA(10);
        operation.setNumB(3);
        System.out.println(operation.getResult());

        MathFactory mathMul = new MathMul();
        operation = mathMul.createMathOperation();
        operation.setNumA(2);
        operation.setNumB(5);
        System.out.println(operation.getResult());

        MathFactory mathDiv = new MathDiv();
        operation = mathDiv.createMathOperation();
        operation.setNumA(20);
        operation.setNumB(5);
        System.out.println(operation.getResult());

    }
}