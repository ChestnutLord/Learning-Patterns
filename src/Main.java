import Creational.Abstract_Fabrica.AbstractFactory;
import Creational.Abstract_Fabrica.ClassicFactory;
import Creational.Fabrica.*;

public class Main {
    public static void main(String[] args) {

//        Vehicle car = new Car();
//        car.drive();
//
//        Vehicle bike = new Bike();
//        bike.drive();

        System.out.println("factory method/////////////////////////");
        VehicleFactory vehicleFactory =new BikeFactory();
        Vehicle vehicle = vehicleFactory.createVehicle();
        vehicle.drive();
        System.out.println();

        System.out.println("abstract factory method/////////////////////////");
        AbstractFactory abstractFactory=new ClassicFactory();
        abstractFactory.giveChair().giveName();
        abstractFactory.giveSofa().giveName();
        System.out.println();

    }
}