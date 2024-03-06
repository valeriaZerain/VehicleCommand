import java.util.ArrayList;
import java.util.List;

public class RideVehicle {
    public RideVehicle(){}
    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle();
        Truck truck = new Truck();
        Truck truck2 = new Truck();

        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(motorcycle);
        vehicleList.add(truck);
        vehicleList.add(truck2);

        Command command = new StartVehicle(motorcycle);
        Command command1 = new AccelerateVehicle(motorcycle);
        Command command2 = new StartAllVehicles(vehicleList);

        GhostRider ghostRider = new GhostRider(command);
        ghostRider.setCommand(command);
        ghostRider.takeAction(command);
        ghostRider.revertAction();
        System.out.println("*****************************");
        ghostRider.setCommand(command1);
        ghostRider.takeAction(command1);
        ghostRider.revertAction();
        System.out.println("*****************************");
        ghostRider.setCommand(command2);
        ghostRider.takeAction(command2);
        ghostRider.revertAction();

    }
}