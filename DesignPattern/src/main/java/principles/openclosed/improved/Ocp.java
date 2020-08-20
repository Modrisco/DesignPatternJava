package principles.openclosed.improved;

/**
 * @author mlx
 */
public class Ocp {

    public static void main(String[] args) {
        GraphicEditor editor = new GraphicEditor();
        editor.drawShape(new Rectangle());
        editor.drawShape(new Circle());
        editor.drawShape(new Triangle());
        editor.drawShape(new Star());
    }

}

class GraphicEditor {

    public void drawShape(Shape s) {
        s.draw();
    }
}

abstract class Shape {
    int m_type;

    public abstract void draw();
}

class Rectangle extends Shape {
    public Rectangle() {
        super.m_type = 1;
    }

    @Override
    public void draw() {
        System.out.println("This is a rectangle");
    }
}

class Circle extends Shape {
    public Circle() {
        super.m_type = 2;
    }

    @Override
    public void draw() {
        System.out.println("This is a circle");
    }
}

class Triangle extends Shape {
    public Triangle() {
        super.m_type = 3;
    }

    @Override
    public void draw() {
        System.out.println("This is a triangle");
    }
}

class Star extends Shape {
    public Star() {
        super.m_type = 4;
    }

    @Override
    public void draw() {
        System.out.println("This is a star");
    }
}