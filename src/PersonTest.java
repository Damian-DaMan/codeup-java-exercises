public class PersonTest {


    public static void main(String[] args) {
        Person per = new Person("Damian");
        System.out.println(per.getName());
        per.setName("Richard");
        System.out.println(per.getName());
        per.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName())); // true
//        System.out.println(person1 == person2); // false

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
//        System.out.println(person2.getName()); // actual manipultes person2 to "John"

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName()); // prints John
//        System.out.println(person2.getName()); // prints John
//        person2.setName("Jane");               // setting person2 to Jane, which should now force person1 to change to Jane
//        System.out.println(person1.getName()); // prints Jane
//        System.out.println(person2.getName()); // prints Jane





        // bottom of main test area
    }
    // End of class file below
}
