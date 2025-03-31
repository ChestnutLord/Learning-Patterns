package Behave.Observer;

import java.util.ArrayList;
import java.util.List;

public class JobsCite implements Observed {
    private List<String> vacancies = new ArrayList<>();
    private List<Observer> subscribers = new ArrayList<>();

    public void addVacancy(String string) {
        vacancies.add(string);
    }

    @Override
    public void addSubscriber(Observer subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Observer subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscriber() {
        for (Observer o : subscribers) {
            o.handleEvent(vacancies);
        }
    }
}
