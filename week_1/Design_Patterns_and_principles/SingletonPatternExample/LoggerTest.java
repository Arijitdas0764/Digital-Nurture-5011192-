package Java_FSE.week_1.Design_Patterns_and_principles.SingletonPatternExample;

public class LoggerTest {
    public static void main(String[] args) {

        // Testing the Singleton pattern
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();


        // Checking if both references point to the same object
        if (logger1 == logger2) {
            System.out.println("Both loggers are the same instance.");
        } else {
            System.out.println("Both loggers are different instances.");
        }


        // Test logging
        logger1.log("This is a test log message.");

        
        // Checking if both references still point to the same object
        if (logger1 == logger2) {
            System.out.println("Both loggers are still the same instance.");
        } else {
            System.out.println("Both loggers are different instances.");
        }
    }
}
