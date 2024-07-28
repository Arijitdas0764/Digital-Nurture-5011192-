package Java_FSE.week_1.Design_Patterns_and_principles.CommandPatternExample;

public class CommandPatternTest {
    public static void main(String[] args) {
        Light light = new Light();
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        RemoteControl remoteControl = new RemoteControl();

        System.out.println("=== Turning light on ===");
        remoteControl.setCommand(lightOn);
        remoteControl.pressButton();

        System.out.println("=== Turning light off ===");
        remoteControl.setCommand(lightOff);
        remoteControl.pressButton();
    }
}
