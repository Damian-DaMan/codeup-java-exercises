package Inheritance;

public class JuniorDeveloper extends Developer {

    public boolean isDebugging;

    public boolean isDebugging() {
        return isDebugging;
    }

    public void setDebugging(boolean debugging) {
        isDebugging = debugging;
    }

    public JuniorDeveloper(String name, int age, boolean debugging) {
        super(name, age);
        this.isDebugging = debugging;

    }

    public String coding(boolean isCoding) {
        return isCoding ? super.getName() + " Is coding and very nervous" : super.getName() + " Fired";
    }

    public static void main(String[] args) {
        JuniorDeveloper jd = new JuniorDeveloper("Bobby", 38, true);
        boolean isDebuggingOrNaw = jd.isDebugging();
        System.out.println(isDebuggingOrNaw);

    }
}
