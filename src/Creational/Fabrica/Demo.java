package Creational.Fabrica;

public class Demo {
    public static void main(String[] args) {
        //        Vehicle car = new Car();
//        car.drive();
//
//        Vehicle bike = new Bike();
//        bike.drive();

        VehicleFactory vehicleFactory =new BikeFactory();
        Vehicle vehicle = vehicleFactory.createVehicle();
        vehicle.drive();
    }
}
