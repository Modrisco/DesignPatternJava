package designpattern.factory.simple2;

public class CashRebate extends AbstractCash {
    public double debate;
    public CashRebate(double cashDebate) {
        debate = cashDebate;
    }
    @Override
    public double acceptCash(double cash) {
        return cash * debate;
    }
}
