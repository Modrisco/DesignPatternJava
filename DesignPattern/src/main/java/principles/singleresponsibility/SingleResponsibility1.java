package principles.singleresponsibility;

/**
 * @author mlx
 */
public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("motor bike");
        vehicle.run("car");
        // doesn't make sense:
        vehicle.run("plane");
    }
}

// vehicle class

class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " is running on the road...");
    }
}
