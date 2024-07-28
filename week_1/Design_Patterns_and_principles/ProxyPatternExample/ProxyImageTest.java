package Java_FSE.week_1.Design_Patterns_and_principles.ProxyPatternExample;

public class ProxyImageTest {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        image1.display();
        image2.display();
        image1.display();
    }
}
