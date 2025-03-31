package Behave.Observer;

import java.util.List;

public class Subscriber implements Observer {

    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancy) {
        System.out.println("Dear subscriber " + name + ", please look at this vacancies: " + vacancy);
        System.out.println();
    }
}
