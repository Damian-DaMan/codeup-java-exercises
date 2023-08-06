package util;

import java.util.Scanner;

public class Input {

    // this is our personal Scanner we are creating for ourselves.
    private final Scanner scanner;

    // Constructor
     public Input() {
        scanner = new Scanner(System.in);
    }
    // String method for the class Input
    private String getString() {
         return scanner.nextLine();
    }
    // Boolean method for our class Input
    private boolean getBoolean() {
        String userInput = scanner.next().toLowerCase();
        return userInput.equals("y") || userInput.equals("yes");
    }














}
