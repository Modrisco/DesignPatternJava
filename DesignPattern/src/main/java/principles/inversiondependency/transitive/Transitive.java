package principles.inversiondependency.transitive;

/**
 * @author mlx
 */
public class Transitive {

    public static void main(String[] args) {
        LG lg = new LG();

        TurnOnAndTurnOffImpl1 impl1 = new TurnOnAndTurnOffImpl1();
        impl1.turnOn(lg);

        TurnOnAndTurnOffImpl2 impl2 = new TurnOnAndTurnOffImpl2(lg);
        impl2.turnOn();

        TurnOnAndTurnOffImpl3 impl3 = new TurnOnAndTurnOffImpl3();
        impl3.setTv(lg);
        impl3.turnOn();
    }

}

/**
 * 1. Transitive by interface
 */
interface ITurnOnAndTurnOff1 {
    public void turnOn(ITV itv);
}

interface ITV {
    public void play();
}

class TurnOnAndTurnOffImpl1 implements ITurnOnAndTurnOff1 {

    public void turnOn(ITV itv) {
        itv.play();
    }
}


/**
 * 2. Transitive by constructor
 */
interface ITurnOnAndTurnOff2 {
    public void turnOn();
}

class TurnOnAndTurnOffImpl2 implements ITurnOnAndTurnOff2 {
    public ITV itv;
    public TurnOnAndTurnOffImpl2(ITV itv) {
        this.itv = itv;
    }
    public void turnOn() {
        this.itv.play();
    }
}

/**
 * 3. Transitive by setter
 */
interface ITurnOnAndTurnOff3 {
    public void turnOn();

    public void setTv(ITV itv);
}

class TurnOnAndTurnOffImpl3 implements ITurnOnAndTurnOff3 {
    private ITV itv;
    public void turnOn() {
        this.itv.play();
    }

    public void setTv(ITV itv) {
        this.itv = itv;
    }
}

class LG implements ITV {
    public void play() {
        System.out.println("This is an LG TV");
    }
}