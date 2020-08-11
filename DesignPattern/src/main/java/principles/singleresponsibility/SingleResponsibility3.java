package principles.singleresponsibility;

/**
 * @author mlx
 */
public class SingleResponsibility3 {
    public static void main(String[] args) {
        MultiVehicle multiVehicle = new MultiVehicle();
        multiVehicle.run("car");
        multiVehicle.fly("plane");
        multiVehicle.swim("submarine");
    }
}

// follow single responsibility principle in method level

class MultiVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " is running on the road...");
    }

    public void fly(String vehicle) {
        System.out.println(vehicle + " is flying in the air...");
    }

    public void swim(String vehicle) {
        System.out.println(vehicle + " is swimming in the water...");
    }
}