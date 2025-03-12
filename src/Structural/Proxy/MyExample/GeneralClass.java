package Structural.Proxy.MyExample;

public class GeneralClass implements GeneralMethod{
    @Override
    public void method() throws InterruptedException {
        System.out.println("General method starting");
        Thread.sleep(40);
        System.out.println("General method is done");
    }
}
