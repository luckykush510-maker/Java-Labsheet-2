import java.util.Scanner;

public class Q21_Factors_Do_While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int i = 1;
            System.out.println("Factors:");
            do {
                if (n % i == 0)
                    System.out.print(i + " ");
                i++;
            } while (i <= n);
            System.out.println();
        }

        sc.close();
    }
}
