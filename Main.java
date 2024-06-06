import IA.Honda;
import IA.Yamaha;

public class Main {
    public static void main(String[] args) {
        var supra = new Honda("supra");
        supra.run();
        supra.stop();

        System.out.println("----------------------------");

        var R15 = new Yamaha("R15");
        R15.run();
        R15.stop();
    }
}