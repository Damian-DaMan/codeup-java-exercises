import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {
        //Exercise 1 invoking
//        System.out.println(returnAdd(10, 5));
//        System.out.println(returnSub(20, 10));
//        System.out.println(returnMultiply(10, 10));
//        System.out.println(returnDivide(100, 10));
//        System.out.println(returnMod(99, 10));

//        bonus
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        timesTableLoop(number);

        // Exercise 2
        int userInput = getInteger(1, 10); // mine
        System.out.println("Valid input: " + userInput); // mine
//        System.out.println("Your number is: " + getInteger(1,10));

        // Exercise 3
        do {
            // you already have this above somewhere for the int=userInput = getInteger(1, 10);
//            int userInput = getInteger(1, 10);
            long factorial = calculateFactorial(userInput);
            System.out.println("!" + userInput + " = " + getFactorialExpression(userInput));
            System.out.println("Factorial number: " + factorial);

            System.out.print("Do you want to continue? (y/n): ");
//            Scanner scanner = new Scanner(System.in);
            String continueChoice = scanner.nextLine();

            // Check if the user wants to continue
            if (!continueChoice.equalsIgnoreCase("y")) {
                break;
            }
        } while (true);


        // Exercise#4
//askUsertoRoll();






    }
//    Exercise#1:
//    Each function needs to take two parameters/arguments so that the operation can be performed.

//    //    Addition:
//    public static int returnAdd(int num1, int num2) {
//        return num1 + num2;
//    }
//
//    //    Subtraction:
//    public static int returnSub(int num1, int num2) {
//        return num1 - num2;
//    }
//
//    //    Multiplication:
//    public static int returnMultiply(int num1, int num2) {
//        return num1 * num2;
//    }
//
//    //    Division:
//    public static int returnDivide(int num1, int num2) {
//        return num1 / num2;
//    }
//
//
//    //    Add a modulus method that finds the modulus of two numbers.
//    public static int returnMod(int num1, int num2) {
//        return num1 % num2;
//    }
////    Food for thought: What happens if we try to divide by zero? What should happen?
//// Error message: Exception in thread "main" java.lang.ArithmeticException: / by zero
//
////    bonus:
////public static int returnBonus(int num) {
////    for (int i = 0; i < ; i++) {
////
////    }
////}

    // Bonus:
    public static void timesTableLoop(int number) {
        System.out.println("Times Table for " + number + ":");
        for (int i = 1; i <= 12; i++) {
            int result = repeatedAddition(number, i); // <-- Corrected the arguments here
            System.out.println(number + " * " + i + " = " + result);
        }
    }

    public static int repeatedAddition(int a, int b) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            result += a;
        }
        return result; // <-- Added the return statement here
    }

    //Exercise#2
    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between " + min + " and " + max + ": ");
        int input;

        try {
            input = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            // If the input is not a valid integer, call the method recursively to get new input
            System.out.println("Invalid input! Please enter a valid integer.");
            return getInteger(min, max);
        }

        if (input < min || input > max) {
            // If the input is out of range, call the method recursively to get new input
            System.out.println("Input out of range! Please enter a number between " + min + " and " + max + ".");
            return getInteger(min, max);
        }

        // Return the valid input
        return input;
    } // mine
    //walkthrough
//    public static int getInteger(int min, int max) {
//        Scanner scan = new Scanner(System.in);
//        int input = 0;
//
//        do {
//            System.out.println("Please enter an integer between 1 and 10");
//            input = scan.nextInt();
//
//
//        }while (!isInRange(input, min, max));
//
//        return input;
//    }
//
//    public static boolean isInRange(int num, int min, int max) {
//        return num <= max && >= min;
//    }
    // end of walkthrough for exercise2


    // Exercise#3
    public static long calculateFactorial(int number) {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static String getFactorialExpression(int number) {
        StringBuilder expression = new StringBuilder();
        for (int i = 1; i <= number; i++) {
            expression.append(i);
            if (i != number) {
                expression.append(" x ");
            }
        }
        return expression.toString();
    }



    // Exercise#4: walkthrough
//    public static String rollDice(int userDiceRoll) {
//        double diceRollA = Math.floor(Math.random() * userDiceRoll) + 1;
//        double diceRollB = Math.floor(Math.random() * userDiceRoll) + 1;
//        int output1 = (int) diceRollA;
//        int output2 = (int) diceRollB;
//        String completeRoll = output1 + " & " + output2;
//        return completeRoll;
//    }
//
//
//public static void askUserToRoll() {
//        Scanner scan = new Scanner(System.in);
//    System.out.println("enter the number of sides fora a pair of dice: ");
//    int userResponse = scan.nextInt();
//    String rollResponse;
//    do{
//        System.out.println("");
//    }
//}

    // Exercise#5:










}