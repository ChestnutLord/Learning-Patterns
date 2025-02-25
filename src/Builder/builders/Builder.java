package Builder.builders;

import Builder.components.Computer;
import Builder.components.Engine;
import Builder.cars.CarType;

public interface Builder {
    void setEngine(Engine engine);
    void setSeat(int seats);
    void setDor(int dor);
    void setComputer(Computer computer);
    void setCarType(CarType carType);
}
