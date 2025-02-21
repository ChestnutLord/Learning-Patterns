package Builder;

public class Car {
    private int Seats;
    private String Engine;
    private int Dor;
    private String Computer;

    public int getSeats() {
        return Seats;
    }

    public String getEngine() {
        return Engine;
    }

    public int getDor() {
        return Dor;
    }

    public String getComputer() {
        return Computer;
    }

    public void setSeats(int seats) {
        Seats = seats;
    }

    public void setEngine(String engine) {
        Engine = engine;
    }

    public void setDor(int dor) {
        Dor = dor;
    }

    public void setComputer(String computer) {
        Computer = computer;
    }
}
