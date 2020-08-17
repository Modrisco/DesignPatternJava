package principles.inversiondependency.improved;

/**
 * @author mlx
 */
public class DependencyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new Facebook());
    }
}


class Email implements IReceiver {
    public String getInfo() {
        return "Email info: hello, world";
    }
}

class Facebook implements IReceiver {
    public String getInfo() {
        return "Facebook info: goodbye, Mark";
    }
}

class Person {
    public void receive(IReceiver receiver) {
        System.out.println(receiver.getInfo());
    }
}