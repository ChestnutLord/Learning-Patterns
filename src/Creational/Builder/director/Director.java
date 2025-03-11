package Creational.Builder.director;

import Creational.Builder.builders.CarBuilder;
import Creational.Builder.builders.ManualBuilder;
import Creational.Builder.cars.Car;
import Creational.Builder.cars.CarType;
import Creational.Builder.cars.Manual;
import Creational.Builder.components.Computer;
import Creational.Builder.components.Engine;

public class Director {

    CarBuilder carBuilder = new CarBuilder();
    ManualBuilder manualBuilder = new ManualBuilder();

    public Car createSportCar() {
        carBuilder.setCarType(CarType.SPORTS_CAR);
        carBuilder.setComputer(new Computer());
        carBuilder.setDor(1);
        carBuilder.setEngine(new Engine(1000, 1000));
        carBuilder.setSeat(1);
        return carBuilder.build();
    }

    public Car createCityCar() {
        carBuilder.setCarType(CarType.CITY_CAR);
        carBuilder.setComputer(new Computer());
        carBuilder.setDor(4);
        carBuilder.setEngine(new Engine(500, 20000));
        carBuilder.setSeat(5);
        return carBuilder.build();
    }

    public Manual createSportCarManual() {
        manualBuilder.setCarType(CarType.SPORTS_CAR);
        manualBuilder.setComputer(new Computer());
        manualBuilder.setDor(1);
        manualBuilder.setEngine(new Engine(1000, 1000));
        manualBuilder.setSeat(1);
        return manualBuilder.build();
    }
}
