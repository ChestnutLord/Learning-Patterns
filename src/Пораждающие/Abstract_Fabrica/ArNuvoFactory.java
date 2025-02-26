package Пораждающие.Abstract_Fabrica;

public class ArNuvoFactory implements AbstractFactory{

    @Override
    public Chair giveChair() {
        return new ArNuvoChair();
    }

    @Override
    public Sofa giveSofa() {
        return new ArNuvoSofa();
    }
}
