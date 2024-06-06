package IA;

public abstract class Bike implements InterCLS {
    String name;

    Bike(String name) {
        this.name = name;
    }

    abstract void run();
}