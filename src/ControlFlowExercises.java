import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        // exercise 1: while
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i + " ");
//            i++;
//        }

//        for loop
//        for (int i = 5; i <= 15; i++) {
//            System.out.println(i + " ");
//        }

        // exercise 2: do while, count by 2's
//        int j = 2;
//        do {
//            System.out.println(j + " ");
//            j += 2;
//        } while (j <= 100);

//        for loop
//        for (int i = 2; i <= 100; i += 2) {
//            System.out.println(i + " ");
//        }


        // part 2 of 2
//        int j = 100;
//        do {
//            System.out.print(j + " ");
//            j -= 5;
//        } while (j >= -10);

//            for loop
//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.println(i + " ");
//        }


//        part 3 of  do while
//        long j = 2;
//        do {
//            System.out.print(j + " ");
//            j *= j;
//        } while (j <= 1_000_000);

//        for loop
        // long has to be used in order to store the value, don't forget the value
//        for (long i = 2; i <= 1_000_000; i *=i) {
//            System.out.println(i + " ");
//        }

//        Exercise 2: Fizzbuzz
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }


//        Exercise #3: Display table of powers
//        Scanner sc = new Scanner(System.in);
//        long number;
//
//        do {
//            // ask for num input
//            System.out.println("What number would you like to go up to? ");
//            number = sc.nextInt();
//            sc.nextLine();
//            //generate table?
//            System.out.println("here is your table!\n");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//
//            for(long i = 1; i <= number; i++) {
//                long squared = i * i;
//                long cubed = i * i * i;
//                System.out.printf("%-6d | %-7d | %-5d%n", i, squared,cubed);
//            }
//
//            System.out.println("\nDo you want to continue? (yes/no): ");
//        } while (sc.nextLine().equalsIgnoreCase("yes"));
//
//        System.out.println("Thank you for using this table!");

//        Exercise #4: Convert given number grades into letter grades
Scanner sc = new Scanner(System.in);
boolean confirm;
do {
System.out.println("Enter a grade from 0 to 100");
        int grade = sc.nextInt();
//        System.out.println(grade);
    if (grade >= 88) {
        System.out.println(" you got an A");
    } else if (grade >= 80) {
        System.out.println(" you got a B");
    } else if (grade >= 67) {
        System.out.println(" you got a C");
    } else if (grade >= 60) {
        System.out.println(" you got a D");
    } else if (grade <= 59) {
        System.out.println(" you got an F");
    }
    System.out.println(" do you want to continue? [y/n]");
    confirm = sc.next().equalsIgnoreCase("y");

} while (confirm);
        System.out.println("end grading session");
    }
}
