package Creational.Builder.cars;

import Creational.Builder.components.Computer;
import Creational.Builder.components.Engine;

public class Manual {
    private int Seats;
    private Engine engine;
    private int dor;
    private Computer computer;
    private CarType carType;

    public Manual(int seats, Engine engine, int dor, Computer computer, CarType carType) {
        Seats = seats;
        this.engine = engine;
        this.dor = dor;
        this.computer = computer;
        this.carType = carType;
    }

    public int getSeats() {
        return Seats;
    }

    public void setSeats(int seats) {
        Seats = seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getDor() {
        return dor;
    }

    public void setDor(int dor) {
        this.dor = dor;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }
}
