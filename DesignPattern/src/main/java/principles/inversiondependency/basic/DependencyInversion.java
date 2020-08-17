package principles.inversiondependency.basic;

/**
 * @author mlx
 */
public class DependencyInversion {

    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }

}


class Email {
    public String getInfo() {
        return "Email info: hello, world";
    }
}

/**
 * Person class receive message
 * 1. Easy to implement
 * 2. If received object is not Email, new classes are needed,
 *    Person class needs new receive method
 * 3. Solution: Import an abstract interface - Receiver as
 *    receiver, Person depends on IReceiver
 *    Because Email, xxx are in scope of receiving.
 *    Implement IReceiver respectively
 */
class Person {
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}