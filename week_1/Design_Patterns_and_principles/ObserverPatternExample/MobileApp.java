package Java_FSE.week_1.Design_Patterns_and_principles.ObserverPatternExample;

public class MobileApp implements Observer {
    private String name;

    public MobileApp(String name) {
        this.name = name;
    }

    @Override
    public void update(double price) {
        System.out.println("MobileApp " + name + " received update: Rs." + price);
    }
}
