package factory.simplefactory;

public class OperationFactoryImpl implements OperationFactory {
    protected double numA;
    protected double numB;

    public double getNumA() {
        return numA;
    }

    public void setNumA(double numA) {
        this.numA = numA;
    }

    public double getNumB() {
        return numB;
    }

    public void setNumB(double numB) {
        this.numB = numB;
    }

    public double getResult() {
        double result = 0L;
        return result;
    }
}
