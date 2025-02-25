package Builder.director;

import Builder.builders.CarBuilder;
import Builder.builders.ManualBuilder;
import Builder.cars.Car;
import Builder.cars.CarType;
import Builder.cars.Manual;
import Builder.components.Computer;
import Builder.components.Engine;

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
