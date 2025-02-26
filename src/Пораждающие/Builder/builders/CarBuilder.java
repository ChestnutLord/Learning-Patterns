package Пораждающие.Builder.builders;

import Пораждающие.Builder.cars.Car;
import Пораждающие.Builder.components.Computer;
import Пораждающие.Builder.components.Engine;
import Пораждающие.Builder.cars.CarType;

public class CarBuilder implements Builder {

    private int seats;
    private Engine engine;
    private int dor;
    private Computer computer;
    private CarType carType;

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setSeat(int seats) {
        this.seats = seats;
    }

    @Override
    public void setDor(int dor) {
        this.dor = dor;
    }

    @Override
    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public Car build(){
        return new Car(seats,engine,dor,computer,carType);
    }
}
