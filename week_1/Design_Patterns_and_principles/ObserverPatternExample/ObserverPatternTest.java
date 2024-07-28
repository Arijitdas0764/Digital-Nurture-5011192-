package Java_FSE.week_1.Design_Patterns_and_principles.ObserverPatternExample;

public class ObserverPatternTest {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp1 = new MobileApp("MobileApp1");
        Observer webApp1 = new WebApp("WebApp1");
        Observer mobileApp2 = new MobileApp("MobileApp2");

        stockMarket.register(mobileApp1);
        stockMarket.register(webApp1);
        stockMarket.register(mobileApp2);

        stockMarket.setLatestPrice(100.99);

        System.out.println("Deregistering MobileApp1...");
        stockMarket.deregister(mobileApp1);

        stockMarket.setLatestPrice(101.5);
    }
}