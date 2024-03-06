public class Truck implements Vehicle{
    public Truck(){}

    @Override
    public void accelerate() {
        System.out.println("El camión acelera");
    }

    @Override
    public void decelerate() {
        System.out.println("El camión desacelera");
    }

    @Override
    public void start() {
        System.out.println("El camión está encendido");
    }

    @Override
    public void stop() {
        System.out.println("El camión está apagado");
    }
}
