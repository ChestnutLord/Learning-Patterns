package Пораждающие.Builder.demo;

import Пораждающие.Builder.cars.Car;
import Пораждающие.Builder.director.Director;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();
        Car sportCar= director.createSportCar();
        System.out.println("Type "+sportCar.getCarType()+" Computer= "+sportCar.getComputer()+" Dor = "+ sportCar.getDor()+" Seats= "+sportCar.getSeats());
        director.createCityCar();
        director.createSportCarManual();
    }
}
