package Java_FSE.week_1.Design_Patterns_and_principles.MVCPatternExample;

public class StudentView {
    public void displayStudentDetails(Student student) {
        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Grade: " + student.getGrade());
    }
}