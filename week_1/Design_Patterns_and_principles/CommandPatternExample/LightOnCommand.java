package Java_FSE.week_1.Design_Patterns_and_principles.CommandPatternExample;

public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.switchOn();
    }
}