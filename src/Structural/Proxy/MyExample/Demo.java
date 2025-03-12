package Structural.Proxy.MyExample;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        GeneralMethod proxy=new ProxyGeneralClass();
        proxy.method();
    }
}
