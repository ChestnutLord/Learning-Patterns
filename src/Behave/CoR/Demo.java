package Behave.CoR;

public class Demo {
    public static void main(String[] args) {
        Notifier notifier = new FirstNotifier(ConstLevels.FIRST);
        Notifier secondNotifier = new SecondNotifier(ConstLevels.SECOND);
        Notifier thirdNotifier = new ThirdNotifier(ConstLevels.THIRD);

        notifier.setNextNotifier(secondNotifier);
        secondNotifier.setNextNotifier(thirdNotifier);

        notifier.doNotify("All is OK",1);
        System.out.println("////////////////////////////");
        notifier.doNotify("Sth went wrong",2);
        System.out.println("////////////////////////////");
        notifier.doNotify("WE NEED HELP",3);
    }
}
