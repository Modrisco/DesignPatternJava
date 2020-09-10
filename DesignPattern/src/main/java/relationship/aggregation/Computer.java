package relationship.aggregation;


/**
 * @author mlx
 * Members can be devided from the major
 */
public class Computer {
    private Mouse mouse;

    public Mouse getMouse() {
        return mouse;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    private Keyboard keyboard;

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }
}
