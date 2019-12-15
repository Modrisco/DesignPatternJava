package designpattern.factory.simple2;

public class CashReturn extends AbstractCash {
    public double cashThreshold;
    public double cashReturn;
    public CashReturn(double inputCashThreshold, double inputCashReturn) {
        cashThreshold = inputCashThreshold;
        cashReturn = inputCashReturn;
    }

    @Override
    public double acceptCash(double cash) {
        return cash - Math.floor(cash / cashThreshold) * cashReturn;
    }
}
