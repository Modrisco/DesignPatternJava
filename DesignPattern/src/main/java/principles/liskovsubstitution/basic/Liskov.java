package principles.liskovsubstitution.basic;

/**
 * @author mlx
 */
public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11 - 3 = " + a.foo(11, 3));
        System.out.println("1 - 8 = " + a.foo(1, 8));

        System.out.println("----------------------------");

        B b = new B();
        System.out.println("11 - 3 = " + b.foo(11, 3));
        System.out.println("1 - 8 = " + b.foo(1, 8));
        System.out.println("11 - 3 + 9 = " + b.bru(11, 3));
    }
}


class A {
    public int foo(int a, int b) {
        return a - b;
    }
}

@SuppressWarnings("all")
class B extends A {
    // Override uncousiously
    public int foo(int a, int b) {
        return a + b;
    }

    public int bru(int a, int b) {
        return foo(a, b) + 9;
    }
}