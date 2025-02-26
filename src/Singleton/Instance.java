package Singleton;

public final class Instance {
    private Instance() {
    }

    static Instance target;

    public static Instance getInstance() {
        if (target == null) {
            target = new Instance();
        }
        return target;
    }
}
