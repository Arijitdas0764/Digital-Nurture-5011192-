package Java_FSE.week_1.Design_Patterns_and_principles.BuilderPatternExample;

public class Computer {
    private String cpu;
    private int ram;
    private String storage;
    private boolean graphicsCard;
    private boolean bluetooth;

    private Computer(ComputerBuilder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.bluetooth = builder.bluetooth;
    }

    public static class ComputerBuilder {
        private String cpu;
        private int ram;
        private String storage;
        private boolean graphicsCard;
        private boolean bluetooth;

        public ComputerBuilder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public ComputerBuilder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public ComputerBuilder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public ComputerBuilder setGraphicsCard(boolean graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public ComputerBuilder setBluetooth(boolean bluetooth) {
            this.bluetooth = bluetooth;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }


    public void printComputerDetails() {
        System.out.println("Computer{" +"cpu='" + cpu + '\'' +", ram=" + ram +", storage='" + storage + '\'' +", graphicsCard=" + graphicsCard +", bluetooth=" + bluetooth +'}');
    }
}
