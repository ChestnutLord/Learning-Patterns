package Behave.CoR;

public class ThirdNotifier extends Notifier{
    public ThirdNotifier(int level) {
        super(level);
    }

    @Override
    public void write(String message) {
        System.out.println("Message from 3 level "+ message);
    }
}
