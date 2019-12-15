package designpattern.factory.simple2;

public class CashFactory {
    public static AbstractCash createAcceptCash(String type) {
        AbstractCash abstractCash;
        switch (type) {
            case "A":
                abstractCash = new CashNormal();
                break;
            case "B":
                abstractCash = new CashRebate(0.8);
                break;
            case "C":
                abstractCash = new CashReturn(300, 100);
                break;
            default:
                throw new RuntimeException("Unsupported type");
        }
        return abstractCash;
    }
}
