public class HelloWorld {
    public static void main(String[] args) {
//        System is a class, out is a method, println is the "console.log() of Java"
//        short hand of .log<tab key> is sout<tab key>
        System.out.println("Hello, Ent!");
        System.out.println("little Hi, little Hoe");
        System.out.println("Java is \"fun\"");
//        souf<tab key> does the one below
//        System.out.printf("I will say something here: %s", str);

        int favNum = 12; // practice from lecture
        boolean whateverIWant = true; // practice from lecture
        String someString = "hello there"; // practice from lecture

//        Java Syntax, Data Types, and Variables Exercise


//            Exercise 1: Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
        int myFavoriteNumber = 22;
        System.out.println(myFavoriteNumber);


//        Exercise 2: Create a String variable named myString and assign a string value to it, then print the variable out to the console.
        String myString = "d";
        System.out.println(myString);

//Exercise 3: looks like we can't use a single quote on the string, only the double quotes to print out the "d" i put in the myString variable.


//        Exercise 4: Change your code to assign the value 3.14159 to myString. What happens?
//myString = 3.14159; can't put a number in a declared String

//Exercise 5:
//long myNumber;
//        System.out.println(myNumber); // java: variable myNumber might not have been initialized

        // Exercise 6: Change your code to assign the value 3.14 to myNumber. What do you notice?
//        myNumber = 3.14;
        /* Answer: java: incompatible types: possible lossy conversion from double to long */
//        long is only whole numbers

//        Exercise #7: Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
//        long myNumber = 123L;
//        System.out.println(myNumber); // it prints, but takes out the "L"

//        Exercise #8: Change your code to assign the value 123 to myNumber.
//        long myNumber = 123;
//        System.out.println(myNumber); // it prints out the same as exercise 7

//        Exercise #9: Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
        float myNumber = 3.14F;
        // float has to be declared and the "F" has to be at the end for the true float to use. This goes up to 0.xxxxxxx, while double goes further covering, 0.xxxxxxxxxxxxxxxx


        // Exercise #10:
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

        // Exercise #11
        // tried to create a new class, get an error when ran for, "java: illegal start of expression"
//        public class Damian {
//
//        }

//        Exercise #12:
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
        // this won't work since you're putting a "String" in an int, which are two different value types.
//        int three = (int) "three";

        // Exercise#13:
//        int x = 4;
//        x = x + 5;
//        System.out.println(x);
//        int x = 4;
//        x += 5;
//        System.out.println(x); // this works for the two lines of code above.
//        int x = 3;
//        int y = 4;
//        y = y * x;
//        System.out.println(x);
//        System.out.println(y);
//        int x = 3;
//        int y = 4;
//y *= x;
//        System.out.println(y); // this works
//        int x = 10;
//        int y = 2;
//////        x = x / y;
////        y = y - x;
//        System.out.println(x);
//        System.out.println(y);
//x /= y;
//y -= x;

//        Exercise #14:
//        java would pre-determine if the expression meets the requirements
//        answer1: comp error when you store something bigger than the declared, compliation error
        byte exampleByte = 127;
        exampleByte++;
        System.out.println(exampleByte);
        // answer:2 when we increment past the type's capacity, it will loop to the lower(or upper if we're subtracting) bounds
//        of wha that data type can hold


    }
}
