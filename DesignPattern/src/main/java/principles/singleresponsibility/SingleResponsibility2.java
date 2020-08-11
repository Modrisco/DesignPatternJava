package principles.singleresponsibility;

/**
 * @author mlx
 * implement single responsibility by breaking classes
 */
public class SingleResponsibility2 {
    public static void main(String[] args) {
        VehicleOnTheRoad vehicleRoad = new VehicleOnTheRoad();
        vehicleRoad.run("car");

        VehicleInTheAir vehicleAir = new VehicleInTheAir();
        vehicleAir.run("plane");

    }
}


class VehicleOnTheRoad {
    public void run(String vehicle) {
        System.out.println(vehicle + " is running on the road...");
    }
}

class VehicleInTheAir {
    public void run(String vehicle) {
        System.out.println(vehicle + " is flying in the air");
    }
}
