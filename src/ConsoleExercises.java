import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        Lecture/notes
//        Scanner sc = new Scanner(System.in); // System.in is a parameter for user inputs
//        System.out.print("What is your name? " );
//        String userInput = sc.nextLine();
////        System.out.println("My name is " + userInput);
//        System.out.printf("The users name is: %s", userInput);

//        Exercise 1
//        double pi = 3.14159;
        //        The value of pi is approximately 3.14.
        // the %.2f, forces only 2 decimal places after the decimal to be written.
//        System.out.printf("The value of pi is approximately %.2f.%n", pi);

//        Exercise 2: Prompt a user to enter an integer and store that value in an int variable using the nextInt method.
        Scanner sc = new Scanner(System.in);
//        int userInput;
//        System.out.println("Enter a number: ");
//        userInput = sc.nextInt();
//        System.out.println(userInput);
//         What happens if you input something that is not an integer?
        // you'll get a runtime error, input mismatch

//        Exercise#3: Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the                 console, each on a newline.
        // my version of the exercise
//        System.out.println("What is your first name, last name, and age?");
//        String firstInput = sc.next();
//        String secondInput = sc.next();
//        int thirdInput = Integer.parseInt(sc.next());
//        System.out.println("My first name is, " + firstInput);
//        System.out.printf("The users first name is: %s%n, %s%n, %d%n", firstInput, secondInput, thirdInput);
//        System.out.println("Enter a sentence: ");
//        String sentenceInput = sc.nextLine();
//        System.out.printf(sentenceInput);

        // walkthrough of #3
//        System.out.println("Enter three words, separated by spaces");
//        String userWordOne = sc.next();
//        String userWordTwo = sc.next();
//        String userWordThree = sc.next();
//        System.out.println(userWordOne);
//        System.out.println(userWordTwo);
//        System.out.println(userWordThree);
//        What happens if you put less than 3 words? can't complete the run'
//      what happens if you input more than 3 words? it won't take it the 4th. it ignores the last input

// sentence exercise
//        System.out.println("Enter a sentence: ");
//        // did we capture all the words with .next() method? NO, it takes only the first input before any whitespice. .nextLine() is the one to use to get the "whole" sentence.
//        String userSentence = sc.nextLine();
//        System.out.println(userSentence);


//        Perimeter #1
// my attempt for the exercise, so this didn't pass through after the input of width. It breaks.
//        System.out.println("enter a length ");
//        String length = sc.nextLine();
//        System.out.println("enter a width ");
//        String width = sc.nextLine();
//
//        int parsedWidth = parseInt(length);
//        int parsedLength = parseInt(width);
//
//        System.out.printf("%s, %s %n", parsedLength, parsedWidth);
//
//// area
//        double area = parsedLength * parsedWidth;
//        System.out.println(area);
//        double perimeter = (parsedLength * 2) + (parsedWidth * 2);
//        System.out.println(perimeter);
//        // both
//        System.out.printf("The area of the rectangle is %s, and the perimeter is %s", area, perimeter);

        // walkthrough with STEVE on the above exercise
        // length
//        System.out.println("enter length: ");
//        String userLengthInput = sc.nextLine();
//        int length = Integer.parseInt(userLengthInput);
////        System.out.println(length);
//        // width
//        System.out.println("enter width: ");
//        String userWidthInput = sc.nextLine();
//        int width = Integer.parseInt(userWidthInput);
////        System.out.println(width);
//        int area = length * width;
//        int perimeter = (length * 2) + (width * 2);
//
//        System.out.printf("The area is %s, and the perimeter is, %s.%n", area, perimeter);

        // Rick's code for walkthrough, THIS WORKS GREAT, please review over again so you can understand.
        System.out.println("\nEnter the length of the classroom: ");
        double length = Double.parseDouble(sc.nextLine());
        System.out.println("\nEnter the width of the classroom: ");
        double width = Double.parseDouble(sc.nextLine());
        System.out.println("\nEnter the height of the classroom: ");
        double height = Double.parseDouble(sc.nextLine());

        double area = length * width;
        System.out.println("The area of the classroom is: " + area);
        double perimeter = (length * 2) + (width * 2);
        System.out.println("The perimeter of the classroom is: " + perimeter);
        double volume = length * width * height;
        System.out.println("The volume of the classroom is: " + volume);


    }

}
