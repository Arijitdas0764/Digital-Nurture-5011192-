package Java_FSE.week_1.Design_Patterns_and_principles.ObserverPatternExample;

public class WebApp implements Observer {
    private String name;

    public WebApp(String name) {
        this.name = name;
    }

    @Override
    public void update(double price) {
        System.out.println("WebApp " + name + " received update: Rs." + price);
    }
}
