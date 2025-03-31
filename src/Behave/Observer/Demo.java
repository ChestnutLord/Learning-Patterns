package Behave.Observer;

public class Demo {
    public static void main(String[] args) {
        JobsCite jobsCite=new JobsCite();

        jobsCite.addVacancy("First vacancy");
        jobsCite.addVacancy("Second vacancy");

        jobsCite.addSubscriber(new Subscriber("John"));
        jobsCite.addSubscriber(new Subscriber("Aaron"));

        jobsCite.addVacancy("Third vacancy");

        jobsCite.notifySubscriber();
    }
}
