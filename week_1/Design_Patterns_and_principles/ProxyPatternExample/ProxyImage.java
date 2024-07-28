package Java_FSE.week_1.Design_Patterns_and_principles.ProxyPatternExample;

public class ProxyImage implements Image {
    private String imageUrl;
    private RealImage realImage;
    private boolean isLoaded;

    public ProxyImage(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public void display() {
        if (!isLoaded) {
            realImage = new RealImage(imageUrl);
            isLoaded = true;
        }
        realImage.display();
    }
}
