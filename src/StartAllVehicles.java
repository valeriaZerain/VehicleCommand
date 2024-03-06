import java.util.List;

public class StartAllVehicles implements Command{
    List<Vehicle> vehicleList;

    public StartAllVehicles(List<Vehicle> vehicleList){
        this.vehicleList = vehicleList;
    }
    @Override
    public void execute() {
        for (int i = 0; i < vehicleList.size(); i++){
            vehicleList.get(i).start();
        }
    }

    @Override
    public void revert() {
        for (int i = 0; i < vehicleList.size(); i++){
            vehicleList.get(i).stop();
        }

    }
}
