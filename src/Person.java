public class Person {

    //Exercise 1
    private String name;


    // constructor
    public Person(String name) {
        this.name = name;
    }

    // Getter method
    public String getName() {
        return this.name;
    }

    // setter method
    public void setName(String name) {
        this.name = name;
    }

    // other methods
    public void sayHello() {
        System.out.printf("Hello my name is %s!%n", this.name);
    }


}
