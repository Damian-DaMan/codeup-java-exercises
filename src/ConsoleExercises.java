import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ConsoleExercises {
    public static void main(String[] args) {
//        Lecture/notes
//        Scanner sc = new Scanner(System.in); // System.in is a parameter for user inputs
//        System.out.print("What is your name? " );
//        String userInput = sc.nextLine();
////        System.out.println("My name is " + userInput);
//        System.out.printf("The users name is: %s", userInput);

//        Exercise 1
        double pi = 3.14159;
        //        The value of pi is approximately 3.14.
//        System.out.printf("The value of pi is approximately %s.", pi);

//        Exercise 2: Prompt a user to enter an integer and store that value in an int variable using the nextInt method.
        Scanner sc = new Scanner(System.in);
//         What happens if you input something that is not an integer?
//        int userInput;
//        System.out.println("Enter a number: ");
//        userInput = sc.nextInt();
//        System.out.println(userInput);

//        Exercise#3: Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the                 console, each on a newline.
        // my version of the exercise
//        System.out.println("What is your first name, last name, and age?");
//        String firstInput = sc.next();
//        String secondInput = sc.next();
//        int thirdInput = Integer.parseInt(sc.next());
////        System.out.println("My first name is, " + firstInput);
//        System.out.printf("The users first name is: %s%n, %s%n, %d%n", firstInput, secondInput, thirdInput);
//        System.out.println("Enter a sentence: ");
//        String sentenceInput = sc.nextLine();
//        System.out.printf(sentenceInput);

// sentence exercise
//        System.out.println("Enter a sentence: ");
//        String userSentence = sc.nextLine();
//        System.out.println(userSentence);


//        Perimeter #1

        System.out.println("enter a length ");
        String length = sc.nextLine();
        System.out.println("enter a width ");
        String width = sc.nextLine();

        int parsedWidth = parseInt(length);
        int parsedLength = parseInt(width);

        System.out.printf("%s, %s %n", parsedLength, parsedWidth);


        double area = parsedLength * parsedWidth;
        System.out.println(area);
        double perimeter = (parsedLength * 2) + (parsedWidth * 2);
        System.out.println(perimeter);
        System.out.printf("The area of the rectangle is %s, and the perimeter is %s", area, perimeter);
    }

}
