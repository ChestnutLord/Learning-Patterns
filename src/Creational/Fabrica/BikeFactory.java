package Creational.Fabrica;

public class BikeFactory implements VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        return new Bike();
    }
}
