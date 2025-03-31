package Behave.Observer;

import java.util.List;

public interface Observed {

    void addSubscriber(Observer subscriber);

    void removeSubscriber(Observer subscriber);

    void notifySubscriber();

}
