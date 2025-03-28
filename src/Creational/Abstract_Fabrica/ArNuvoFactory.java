package Creational.Abstract_Fabrica;

public class ArNuvoFactory implements AbstractFactory{

    @Override
    public Chair createChair() {
        return new ArNuvoChair();
    }

    @Override
    public Sofa createSofa() {
        return new ArNuvoSofa();
    }
}
