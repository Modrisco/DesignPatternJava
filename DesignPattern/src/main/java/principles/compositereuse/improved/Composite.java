package principles.compositereuse.improved;

/**
 * @author mlx
 */
public class Composite {
    public static void main(String[] args) {
        B b = new B();
        b.opt(new A());
        C c = new C();
        D d = new D();
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

/**
 * Dependency
 */
class B {
    public void opt(A a) {
        a.opt1();
    }
}

/**
 * Aggression
 */
class C {
    private A a;

    public void setA(A a) {
        this.a = a;
    }
}

/**
 * Composition
 */
class D {
    private A a;
    public D() {
        this.a = new A();
    }
}
