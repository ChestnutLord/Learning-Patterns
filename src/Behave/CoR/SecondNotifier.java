package Behave.CoR;

public class SecondNotifier extends Notifier{

    public SecondNotifier(int level) {
        super(level);
    }

    @Override
    public void write(String message) {
        System.out.println("Message from 2 level "+ message);
    }
}
