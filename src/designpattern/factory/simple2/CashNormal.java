package designpattern.factory.simple2;

/**
 * @author mlx
 */
public class CashNormal extends AbstractCash {
    @Override
    public double acceptCash(double cash) {
        return cash;
    }
}
