package principles.interfacesegregation.improved;


/**
 * @author mlx
 * advanced design obeying interface segregation
 */
public class Segregation {
    public static void main(String[] args) {

        ClassA a = new ClassA();
        a.dependOnOperation1(new ClassB());
        a.dependOnOperation2(new ClassB());
        a.dependOnOperation3(new ClassB());

        ClassC c = new ClassC();
        c.dependOnOperation1(new ClassD());
        c.dependOnOperation4(new ClassD());
        c.dependOnOperation5(new ClassD());

    }
}

interface Interface1 {
    void operation1();
}

interface Interface2 {
    void operation2();
    void operation3();
}

interface Interface3 {
    void operation4();
    void operation5();
}

class ClassB implements Interface1, Interface2 {

    public void operation1() {
        System.out.println("Class B implements operation 1 on interface 1");
    }

    public void operation2() {
        System.out.println("Class B implements operation 2 on interface 2");
    }

    public void operation3() {
        System.out.println("Class B implements operation 3 on interface 2");
    }
}

class ClassD implements Interface1, Interface3 {

    public void operation1() {
        System.out.println("Class C implements operation 1 on interface 1");
    }

    public void operation4() {
        System.out.println("Class C implements operation 4 on interface 3");
    }

    public void operation5() {
        System.out.println("Class C implements operation 5 on interface 3");
    }
}

/**
 * Class A depending on Class B by Interface1
 * only implementing operation 1, 2, 3
 */
class ClassA {
    public void dependOnOperation1(Interface1 i) {
        i.operation1();
    }

    public void dependOnOperation2(Interface2 i) {
        i.operation2();
    }

    public void dependOnOperation3(Interface2 i) {
        i.operation3();
    }
}


/**
 * Class C depending on Class D by Interface1
 * only implementing operation 1, 4, 5
 */
class ClassC {
    public void dependOnOperation1(Interface1 i) {
        i.operation1();
    }

    public void dependOnOperation4(Interface3 i) {
        i.operation4();
    }

    public void dependOnOperation5(Interface3 i) {
        i.operation5();
    }
}
