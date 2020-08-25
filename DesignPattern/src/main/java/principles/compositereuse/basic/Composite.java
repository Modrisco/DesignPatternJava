package principles.compositereuse.basic;

/**
 * @author mlx
 */
public class Composite {
    public static void main(String[] args) {
        B b = new B();
        b.opt2();
    }
}

class A {
    public void opt1() {
        System.out.println("opt 1");
    }

    public void opt2() {
        System.out.println("opt 2");
    }

    public void opt3() {
        System.out.println("opt 3");
    }
}

class B extends A {
}
