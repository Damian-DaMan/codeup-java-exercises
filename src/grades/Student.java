package grades;

import java.util.ArrayList;

public class Student {

    // Instance Variables
    private String name;
    private ArrayList<Integer> grades;


    // Constructor
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // getter
    public String getName() {
        return name;
    }

    //=================================== method to addGrade =============
    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        if (grades.isEmpty()) {
            return 0.0;
        }

        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }

        return (double) sum / grades.size();
    }

}
