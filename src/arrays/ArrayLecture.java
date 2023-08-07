package arrays;

import java.util.Arrays;

public class ArrayLecture {
    public static void main(String[] args) {
//        String[] names;

        // create names array with a set length
//        names = new String[3];

//        System.out.println(names.length);

        // create names array with length set using Math.random
//        int namesLength = (int) (Math.random() + 100);
//        names = new String(namesLength);
//        names = new String[(int) (Math.random() * 100)];
// this would be adding the circles from the other java file to make an object of myCircles.
//        Circle[] myCircles = new Circle[10];
//        System.out.println(names.length);

//        System.out.println(names[0]);
//
//        names[0] = "Damian";
//        names[1] = "Penguin";
//        names[2] = "Theo";

        // spice for loop
//        for (String name : names) {
//            System.out.println(name);
//        }

        // Arrays.fill
        String[] names = new String[6];
        Arrays.fill(names, "Jason");
//        printArray(names);

        // Array.equals
//        String[] namesTo = new String[6];
//        Arrays.fill(namesTo, "John Smith");
//        System.out.println(Arrays.equals(names, namesTo));

        // Arrays.copyOf
//        String[] namesCopy = Arrays.copyOf(names, names.length);

        // Arrays.sort
//        Arrays.sort(names);
//        System.out.println(Arrays.toString(names));
//
//        int[] numbers = {5, 111, 724, 12, 80,1};
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));

        // Two Dimensional Array, String matrix
        String[][] namesMatrix = {
                {"Neo", "Morpheus", "Trinity"},
                {"Cypher", "Dog", "Switch"},
                {"Agent Smith", "Oracle", "Mr. Anderson"},
                {"Pikachu", "Charmander", "Muk"}
        };

        System.out.println(namesMatrix[3][1]);

// this prints out "Strings" of the array, not the correct "way"
        System.out.println(Arrays.toString(namesMatrix));


// this would be the correct way to get our details of the array.
//        for(String[] namesRow : namesMatrix) {
//            for(String name: namesRow) {
//                System.out.println(name);
//            }
//        }


    }
}
