package grades;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("John");
        student.addGrade(90);
        student.addGrade(88);
        student.addGrade(86);

        System.out.println("Student: " + student.getName());
        System.out.println("Average Grade: " + student.getGradeAverage());
    }
}
