package Creational.Abstract_Fabrica;

public class Demo {
    public static void main(String[] args) {
        System.out.println("abstract factory method/////////////////////////");
        AbstractFactory abstractFactory=new ClassicFactory();
        abstractFactory.createChair().getInfo();
        abstractFactory.createSofa().giveInfo();
        System.out.println();
    }
}
