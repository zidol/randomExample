import java.util.Random;

public class Percentage {
    public static void main(String[] args) {
        Random r = new Random();

        System.out.println(r.nextInt(10) + 1);

        if (r.nextInt(10) < 3) {
            System.out.println("30%");
        }
    }
}
