package Java_FSE.week_1.Design_Patterns_and_principles.ObserverPatternExample;

public interface Stock {
    void register(Observer observer);
    void deregister(Observer observer);
    void notifyObservers();
}
