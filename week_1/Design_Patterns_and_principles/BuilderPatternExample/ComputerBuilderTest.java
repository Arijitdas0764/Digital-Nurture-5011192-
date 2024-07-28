package Java_FSE.week_1.Design_Patterns_and_principles.BuilderPatternExample;

public class ComputerBuilderTest {
    public static void main(String[] args) {
        Computer computer1 = new Computer.ComputerBuilder()
                .setCpu("i7")
                .setRam(16)
                .setStorage("1TB SSD")
                .setGraphicsCard(true)
                .setBluetooth(true)
                .build();

        computer1.printComputerDetails();;

        Computer computer2 = new Computer.ComputerBuilder()
                .setCpu("i5")
                .setRam(8)
                .setStorage("512GB SSD")
                .build();

        computer2.printComputerDetails();;
    }
}
