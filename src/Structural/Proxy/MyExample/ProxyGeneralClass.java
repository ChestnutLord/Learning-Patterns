package Structural.Proxy.MyExample;

public class ProxyGeneralClass implements GeneralMethod{

    GeneralClass generalClass=new GeneralClass();

    @Override
    public void method() throws InterruptedException {
        System.out.println("Calling method");
        long startTime=System.currentTimeMillis();
        generalClass.method();
        System.out.println("Method finished in "+(System.currentTimeMillis()-startTime)+" ms");

    }


}
