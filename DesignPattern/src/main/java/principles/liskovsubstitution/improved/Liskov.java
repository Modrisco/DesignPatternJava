package principles.liskovsubstitution.improved;



/**
 * @author mlx
 */
public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11 - 3 = " + a.foo(11, 3));
        System.out.println("1 - 8 = " + a.foo(1, 8));

        System.out.println("----------------------------");

        // B doesn't depend on A anymore, the programmer wouldn't misunderstand that foo is sub
        // Callee method is clear
        B b = new B();
        System.out.println("11 + 3 = " + b.foo(11, 3));
        System.out.println("1 + 8 = " + b.foo(1, 8));
        System.out.println("11 + 3 + 9 = " + b.bru(11, 3));


        System.out.println("----------------------------");
        // Use method from A
        System.out.println("11 - 3 = " + b.fun(11, 3));
    }
}

/**
 * Define a base class
 */
class Base {

}

class A extends Base {
    public int foo(int a, int b) {
        return a - b;
    }
}

class B extends Base {
    private A a = new A();
    public int foo(int a, int b) {
        return a + b;
    }

    public int bru(int a, int b) {
        return foo(a, b) + 9;
    }

    public int fun(int a, int b) {
        return this.a.foo(a, b);
    }
}

