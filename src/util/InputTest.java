package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

// testing getString();
//        System.out.println("Please enter a string");
//        System.out.println(input.getString());

        // testing getInt() from Input.java class.
//        System.out.println("Enter a number between 1.0 and 10.0");
//        System.out.println(input.getInt(1.0, 10.0));

        System.out.println(input.getString("Please enter your name?"));

    }
}
