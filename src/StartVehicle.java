public class StartVehicle implements Command{
    Vehicle vehicle;
    public StartVehicle (Vehicle vehicle){
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.start();
    }

    @Override
    public void revert() {
        vehicle.stop();
    }
}
