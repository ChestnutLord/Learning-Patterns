package Behave.CoR;

public class FirstNotifier extends Notifier{
    public FirstNotifier(int level) {
        super(level);
    }

    @Override
    public void write(String message) {
        System.out.println("Message from 1st level "+ message);
    }
}
