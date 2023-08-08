import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        // Arrays.toString(); makes it where it will show the content inside the array.
        System.out.println(Arrays.toString(numbers)); // return is [I@2a84aee7, which is not readible

        // exercise #1.2
        Person[] people = new Person[3]; // you have to set the length of the array
        people[0] = new Person("Alice");
        people[1] = new Person("Bob");
        people[2] = new Person("Charlie");

//        1.2// Iterate through the array and print the name of each person
        // =====================================================================
        // SPICY LOOP
//        for (Type element : collection) {
//            // Code to be executed for each element
//        }
//=================================================
        for (Person person : people) {
            System.out.println(person.getName());
        }
// to add a direct new person to the people array.
        people = addPerson(people, new Person("Carrie"));
        for(Person person : people) {
            System.out.println(person.getName());
        }
    }

    // 1.3
    public static Person[] addPerson(Person[] people, Person newPerson) {
        // Create a new array with increased length
        Person[] newPeople = Arrays.copyOf(people, people.length + 1);

        // Add the newPerson to the end of the new array
        newPeople[newPeople.length - 1] = newPerson;

        return newPeople;
    }





}

