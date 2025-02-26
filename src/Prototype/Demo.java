package Prototype;

public class Demo {
    public static void main(String[] args) {
        Prototype prototype = new MyObject("Имя", "Yaaew_3-1-uy_eR4", 86, true);
        Prototype prototype2=prototype.clone();
        Prototype prototype3=prototype.clone();
        Prototype prototype4=prototype.clone();

        System.out.println(prototype2);
        System.out.println(prototype3);
        System.out.println(prototype4);
    }
}
