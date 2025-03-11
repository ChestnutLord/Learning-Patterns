package Creational.Builder.builders;

import Creational.Builder.components.Computer;
import Creational.Builder.components.Engine;
import Creational.Builder.cars.CarType;

public interface Builder {
    void setEngine(Engine engine);
    void setSeat(int seats);
    void setDor(int dor);
    void setComputer(Computer computer);
    void setCarType(CarType carType);
}
