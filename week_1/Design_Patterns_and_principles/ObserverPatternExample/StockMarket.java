package Java_FSE.week_1.Design_Patterns_and_principles.ObserverPatternExample;

import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock {
    private List<Observer> observers;
    private double latestPrice;

    public StockMarket() {
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(latestPrice);
        }
    }

    public void setLatestPrice(double price) {
        latestPrice = price;
        notifyObservers();
    }
}
