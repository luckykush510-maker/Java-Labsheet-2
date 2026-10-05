import java.util.Scanner;

public class Q06_Halve_Number_Until_Less_Than_One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        double n = sc.nextDouble();
        int steps = 0;

        if (n > 0) {
            while (n >= 1) {
                n /= 2;
                steps++;
            }
            System.out.println("Final value = " + n);
            System.out.println("Steps = " + steps);
        } else {
            System.out.println("Please enter a positive number.");
        }

        sc.close();
    }
}
