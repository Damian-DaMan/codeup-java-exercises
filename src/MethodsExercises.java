public class MethodsExercises {

    public static void main(String[] args) {
        System.out.println(returnAdd(10,5));
        System.out.println(returnSub(20,10));
        System.out.println(returnMultiply(10,10));
        System.out.println(returnDivide(100,10));
        System.out.println(returnMod(99,10));
    }
//    Exercise#1:
//    Each function needs to take two parameters/arguments so that the operation can be performed.

//    Addition:
    public static int returnAdd(int num1, int num2) {
        return num1 + num2;
    }

//    Subtraction:
public static int returnSub(int num1, int num2) {
        return num1 - num2;
}

//    Multiplication:
public static int returnMultiply(int num1, int num2) {
        return num1 * num2;
}

//    Division:
public static int returnDivide(int num1, int num2) {
        return num1 / num2;
}


//    Add a modulus method that finds the modulus of two numbers.
public static int returnMod(int num1, int num2) {
        return num1 % num2;
}
//    Food for thought: What happens if we try to divide by zero? What should happen?
// Error message: Exception in thread "main" java.lang.ArithmeticException: / by zero

//    bonus:
//public static int returnBonus(int num) {
//    for (int i = 0; i < ; i++) {
//
//    }
//}


}