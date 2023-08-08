package Inheritance;

public class Developer {
    public String name;
    public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Developer d = new Developer("John", 50);

    }

    public Developer(String name, int age) {
        this.name = name;
        this.age = age;


    }

    public String coding(boolean isCoding) {
        return isCoding ? this.name + " is coding something" : this.name + " is eating some food and not coding";
    }


}
