import java.util.Scanner;

public class Q30_Mixed_Advanced_Power4_Toggle_Table {
    static boolean isPowerOfFour(int n) {
        if (n <= 0)
            return false;

        int value = n;
        while ((value & 3) == 0) {
            value >>= 2;
        }
        return value == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        // Shift-based check for power of 4.
        if (isPowerOfFour(n))
            System.out.println(n + " is a power of 4.");
        else
            System.out.println(n + " is not a power of 4.");

        // Toggle the 3rd bit (bit position 2).
        int toggled = n ^ (1 << 2);
        System.out.println("After toggling 3rd bit = " + toggled);

        System.out.println("\nMultiplication table:");
        for (int i = 1; i <= 10; i++) {
            int result = n * i;

            if (result % 6 == 0)
                continue;

            if (result % 48 == 0)
                break;

            System.out.println(n + " x " + i + " = " + result);
        }

        sc.close();
    }
}
