
package com.example;

public class App {

    public String greet(String name) {
        if (name == null || name.isBlank()) {
            return "Hello, Guest!";
        }

        return "Hello, " + name.trim() + "!";
    }

    public int add(int a, int b) {
        return a + b;
    }

    public boolean isAdult(int age) {
        return age >= 18;
    }

    public static void main(String[] args) {
        App app = new App();

        System.out.println(app.greet("DevOps"));
        System.out.println("Addition: " + app.add(10, 20));
        System.out.println("Is adult: " + app.isAdult(21));
    }
}
