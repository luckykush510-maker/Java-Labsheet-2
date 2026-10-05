import java.util.Random;

public class Q29_Random_Until_Divisible_By_7_And_13 {
    public static void main(String[] args) {
        Random random = new Random();
        int count = 0;

        while (true) {
            int number = random.nextInt(100) + 1;
            count++;
            System.out.println("Generated: " + number);

            if (number % 7 == 0 && number % 13 == 0) {
                System.out.println("Found " + number + " after " + count + " attempt(s).");
                break;
            }
        }
    }
}
