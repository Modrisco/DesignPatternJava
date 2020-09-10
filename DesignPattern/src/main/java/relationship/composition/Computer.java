package relationship.composition;

/**
 * @author mlx
 */
public class Computer {
    private Mouse mouse = new Mouse();
    private Keyboard keyboard = new Keyboard();

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }
}
