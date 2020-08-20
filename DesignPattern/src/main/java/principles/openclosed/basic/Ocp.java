package principles.openclosed.basic;


/**
 * @author mlx
 * pros: easy to understand and programming
 * cons: break open-closed principle --> open extending to provider,
 *                                       close changing to user
 * e.g, adding new graphic(triangle), change everywhere
 */
public class Ocp {

    public static void main(String[] args) {
        GraphicEditor editor = new GraphicEditor();
        editor.drawShape(new Rectangle());
        editor.drawShape(new Circle());
        editor.drawShape(new Triangle());
    }
}


/**
 * Class for editing graphs
 */
class GraphicEditor {
    private static final int RECTANGLE = 1;
    private static final int CIRCLE = 2;
    // add new parameter for triangle
    private static final int TRIANGLE = 3;

    public void drawShape(Shape s) {
        if (s.m_type == RECTANGLE) {
            drawRectangle(s);
        } else if (s.m_type == CIRCLE) {
            drawCircle(s);
        } else if (s.m_type == TRIANGLE) {
            drawTriangle(s);
        }
    }

    public void drawRectangle(Shape r) {
        System.out.println("This is a rectangle");
    }

    public void drawCircle(Shape r) {
        System.out.println("This is a circle");
    }

    // add draw function for triangle
    public void drawTriangle(Shape r) {
        System.out.println("This is a triangle");
    }
}


class Shape {
    int m_type;
}

class Rectangle extends Shape {
    public Rectangle() {
        super.m_type = 1;
    }
}

class Circle extends Shape {
    public Circle() {
        super.m_type = 2;
    }
}

/**
 * Add a new graphic type
 */
class Triangle extends Shape {
    public Triangle() {
        super.m_type = 3;
    }
}