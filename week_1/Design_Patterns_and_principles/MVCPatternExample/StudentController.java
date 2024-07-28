package Java_FSE.week_1.Design_Patterns_and_principles.MVCPatternExample;

public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void updateStudentDetails(int id, String name, String grade) {
        model.setId(id);
        model.setName(name);
        model.setGrade(grade);
    }

    public void displayStudentDetails() {
        view.displayStudentDetails(model);
    }
}