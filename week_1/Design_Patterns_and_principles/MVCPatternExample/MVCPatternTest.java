package Java_FSE.week_1.Design_Patterns_and_principles.MVCPatternExample;

public class MVCPatternTest {
    public static void main(String[] args) {
        Student student = new Student(101, "Rahul Sinha", "A");
        StudentView studentView = new StudentView();
        StudentController studentController = new StudentController(student, studentView);
        studentController.displayStudentDetails();

        System.out.println("=== Updating student details ===");
        studentController.updateStudentDetails(120, "Rahul Sinha", "B+");

        System.out.println("=== Displaying student details ===");
        studentController.displayStudentDetails();
    }
}
