public class MethodPractice {
    //    public static void main(String[] args) {


/*
        METHOD STRUCTURE...

        VISIBILITY_MODIFIER STATIC_OR_INSTANCE RETURN_TYPE METHOD_NAME(PARAM_DATATYPE PARAM, ...) {

            BODY OF METHOD HERE

        }

        For Example...

        public static void main(String[] args) {
            System.out.println("Hello World");
        }


     */

    // ----------- DEFINING AND CALLING METHODS WITH VARIOUS INPUTS (examples)

    // no input or returned output

//    public static void sayGreeting() {
//        System.out.println("Hello");
//    }


    // no returned output with input

//    public static void sayInput(String input) {
//        System.out.println(input);
//    }

    // returned output without input

//    public static int returnSeven() {
//        return 7;
//    }

    // return output given an input

//    public static int returnInt(int someInt) {
//        return someInt;
//    }

    // multiple parameters

//    public static double returnProductOfThreeNums(double num1, double num2, double num3) {
//        return num1 * num2 * num3;
//    }


    // using a method inside another method

//    public static int returnSumOfInts(int intOne, int intTwo) {
//        return returnInt(intOne) + returnInt(intTwo);
//    }


    // return type different from input type

//    public static int returnLengthOfString(String input) {
//        return input.length();
//    }

    // multiple input types

//    public static String repeatStr(String str, int times) {
//        return str.repeat(times);
//    }

//    public static void printCharMultipleTimes(char c, int repetitions) {
//        System.out.println(String.valueOf(c).repeat(repetitions));
//    }


    /**
     * METHOD MINI-EXERCISES
     */
    // TODO: Create a new class called MethodPractice and add main method to test these methods...  Completed
//    Were on the file now
    public static void main(String[] args) {
        System.out.println(returnName());
        String longerString = returnLongerString("dog", "damian");
//        System.out.println(canBeHalved("11"));

    }

    // TODO: Write a method, returnName, that returns the string of your name.
    public static String returnName() {
        return "Damian";
    }

    // TODO: Write a method, returnLongerString, that takes in two strings and returns the longer of the two strings.
    public static String returnLongerString(String str1, String str2) {
        if (str1.length() > str2.length()) {
            return str1;
        } else { // The correct syntax for an 'else if' block is 'else if (condition) { ... }'
            return str2;
        }
    }


    // TODO: Write a method, canBeHalved, that takes in an integer and returns true if the input integer is evenly divisible by two.
    public static boolean CanBeHalved(int integer) {
//        boolean intIsEven = integer % 2 == 0;
//        return intIsEven;
        return integer % 2 == 0;
    }


    /**
     * OVERLOAD MINI-EXERCISES
     */

    // TODO: create a method, sayName, that can take in a single name String input or two name String inputs and will return
    public static String sayName(String name, String greeting) {
        return name + greeting;
    }

    // a greeting message to the user by either their first or first and last name.

    // example: sayName("Justin") - "Hi Justin"
    // example: sayName("Justin", "Reich") - "Hi Justin Reich"


    // TODO: overload the math exercises from the curriculum exercise to work with both integers and doubles


}

