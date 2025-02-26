package Пораждающие.Builder.builders;

import Пораждающие.Builder.cars.Manual;
import Пораждающие.Builder.components.Computer;
import Пораждающие.Builder.components.Engine;
import Пораждающие.Builder.cars.CarType;

public class ManualBuilder implements Builder {

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

    public Manual build(){
        return new Manual(seats,engine,dor,computer,carType);
    }
}
