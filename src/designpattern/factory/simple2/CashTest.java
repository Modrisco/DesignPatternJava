package designpattern.factory.simple2;

/**
 * @author mlx
 */
public class CashTest {
    public static void main(String[] args) {
        AbstractCash abstractCashA, abstractCashB, abstractCashC;
        String typeA = "A";
        String typeB = "B";
        String typeC = "C";

        abstractCashA = CashFactory.createAcceptCash(typeA);
        double resultA = abstractCashA.acceptCash(1000);
        abstractCashB = CashFactory.createAcceptCash(typeB);
        double resultB = abstractCashB.acceptCash(1000);
        abstractCashC = CashFactory.createAcceptCash(typeC);
        double resultC = abstractCashC.acceptCash(1000);

        System.out.println("normal: " + resultA);
        System.out.println("rebate: " + resultB);
        System.out.println("return: " + resultC);
    }
}
