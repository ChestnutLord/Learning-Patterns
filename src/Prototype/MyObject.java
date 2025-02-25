package Prototype;

public class MyObject implements Prototype {

    private String name;
    private String type;
    private int id;
    private boolean isWorking;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public MyObject(String name, String type, int id, boolean isWorking) {
        this.name = name;
        this.type = type;
        this.id = id;
        this.isWorking = isWorking;
    }

    @Override
    public Prototype clone() {
        return new MyObject(this.getName()+" 1", this.getType(), this.getId(), this.isWorking);
    }

//    @Override
//    public String toString() {
//        return "name='" + name + '\'' +
//                ", type='" + type + '\'' +
//                ", id=" + id +
//                ", isWorking=" + isWorking +
//                '}';
//    }
}
