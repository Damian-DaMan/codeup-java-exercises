package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student fox = new Student("Fox");
        fox.addGrade(85);
        fox.addGrade(92);
        fox.addGrade(78);
        students.put("fox_god", fox);

        Student marth = new Student("Marth");
        marth.addGrade(76);
        marth.addGrade(88);
        marth.addGrade(95);
        students.put("marth_main", marth);

        Student falco = new Student("Falco");
        falco.addGrade(90);
        falco.addGrade(87);
        falco.addGrade(82);
        students.put("falco_master", falco);

        Student sheik = new Student("Sheik");
        sheik.addGrade(81);
        sheik.addGrade(79);
        sheik.addGrade(88);
        students.put("sheik_champ", sheik);

        Input input = new Input();

        while (true) {
            System.out.println("Welcome to the Super Smash Bros. Melee Student Info App!");
            System.out.println("GitHub Usernames:");

            for (String username : students.keySet()) {
                System.out.print("|" + username + "| ");
            }
            System.out.println("\n");

            String inputUsername = input.getString("What student would you like to see more information on? ");

            if (students.containsKey(inputUsername)) {
                Student selectedStudent = students.get(inputUsername);
                System.out.println("Name: " + selectedStudent.getName());
                System.out.println("Current Average: " + selectedStudent.getGradeAverage());
            } else {
                System.out.println("Sorry, no student found with the GitHub username of \"" + inputUsername + "\".");
            }

            if (!input.yesNo("Would you like to see another student? (yes/no): ")) {
                System.out.println("Goodbye, and have a wonderful day!");
                break;
            }
        }
    }
}
