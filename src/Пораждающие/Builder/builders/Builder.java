package Пораждающие.Builder.builders;

import Пораждающие.Builder.components.Computer;
import Пораждающие.Builder.components.Engine;
import Пораждающие.Builder.cars.CarType;

public interface Builder {
    void setEngine(Engine engine);
    void setSeat(int seats);
    void setDor(int dor);
    void setComputer(Computer computer);
    void setCarType(CarType carType);
}
