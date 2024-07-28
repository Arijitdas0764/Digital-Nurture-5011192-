package Java_FSE.week_1.Design_Patterns_and_principles.ProxyPatternExample;

public class RealImage implements Image {
    private String imageUrl;

    public RealImage(String imageUrl) {
        this.imageUrl = imageUrl;
        loadFromServer();
    }

    private void loadFromServer() {
        System.out.println("\nLoading image from server: " + imageUrl);
    }

    @Override
    public void display() {
        System.out.println("\nDisplaying image: " + imageUrl);
    }
}
