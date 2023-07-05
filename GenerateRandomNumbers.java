import java.util.Random;

public class GenerateRandomNumbers {
    public static void main(String[] args) {
        // aprach 1
        Random rand = new Random();
        int value = rand.nextInt(100);
        System.out.println("Random number : " + value);

        // aproach 2
        System.out.println(Math.random());
    }
}
