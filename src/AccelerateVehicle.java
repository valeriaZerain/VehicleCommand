public class AccelerateVehicle implements Command{
    Vehicle vehicle;
    public AccelerateVehicle(Vehicle vehicle){
        this.vehicle=vehicle;
    }

    @Override
    public void execute() {
        vehicle.accelerate();
    }

    @Override
    public void revert() {
        vehicle.decelerate();
    }
}
