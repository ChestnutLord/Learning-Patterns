package Behave.CoR;

public abstract class Notifier {

    private int level;
    private Notifier nextNotifier;

    public Notifier(int level) {
        this.level = level;
    }

    public void setNextNotifier(Notifier nextNotifier) {
        this.nextNotifier = nextNotifier;
    }

    public void doNotify(String message, int level) {
        if (level >= this.level) {
            write(message);
        }
        if (nextNotifier != null) {
            nextNotifier.doNotify(message, level);
        }
    }

    public abstract void write(String message);
}
