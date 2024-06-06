package IA;

public class Yamaha extends Bike {
    public Yamaha(String name) {
        super(name);
    }

    public void run() {
        System.out.println("running safely, tapi Yamaha");
    }

    public void stop() {
        System.out.println("stopped safely, tapi Yamaha");
    }
}