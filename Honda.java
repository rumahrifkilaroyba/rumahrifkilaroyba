package IA;

public class Honda extends Bike {
    public Honda(String name) {
        super(name);
    }

    public void run() {
        System.out.println("running safely, tapi Honda");
    }

    public void stop() {
        System.out.println("stopped safely, tapi Honda");
    }
}