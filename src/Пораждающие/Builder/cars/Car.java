package Пораждающие.Builder.cars;

import Пораждающие.Builder.components.Computer;
import Пораждающие.Builder.components.Engine;

public class Car {
    private int Seats;
    private Engine engine;
    private int dor;
    private Computer computer;
    private CarType carType;

    public Car(int seats, Engine engine, int dor, Computer computer, CarType carType) {
        Seats = seats;
        this.engine = engine;
        this.dor = dor;
        this.computer = computer;
        this.carType = carType;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public int getSeats() {
        return Seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getDor() {
        return dor;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setSeats(int seats) {
        Seats = seats;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setDor(int dor) {
        this.dor = dor;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }
}
