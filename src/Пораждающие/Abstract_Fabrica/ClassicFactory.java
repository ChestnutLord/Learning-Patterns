package Пораждающие.Abstract_Fabrica;

public class ClassicFactory implements AbstractFactory {
    @Override
    public Chair giveChair() {
        return new ClassicChair();
    }

    @Override
    public Sofa giveSofa() {
        return new ClassicSofa();
    }
}
