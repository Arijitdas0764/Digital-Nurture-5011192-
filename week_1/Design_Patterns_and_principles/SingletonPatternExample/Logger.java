package Java_FSE.week_1.Design_Patterns_and_principles.SingletonPatternExample;

public class Logger {
    private static Logger instance;

    //Constructor
    private Logger() {}

    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
