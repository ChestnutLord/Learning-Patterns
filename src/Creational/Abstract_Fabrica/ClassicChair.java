package Creational.Abstract_Fabrica;

public class ClassicChair implements Chair{
    @Override
    public void giveName() {
        System.out.println("Classic Chair");
    }
}
