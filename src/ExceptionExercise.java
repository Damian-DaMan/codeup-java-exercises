public class ExceptionExercise {
    public static double divideNums(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Cannot divide by 0!");
        }
        return (double) num1 / num2;
    }

    public static void delayedHello(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
//        System.out.println(divideNums(10, 2));
//        System.out.println(divideNums(10, 0));

        delayedHello(1000);
        delayedHello(1000);
        delayedHello(3000);
    }






}
