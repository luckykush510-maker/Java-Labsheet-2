import java.util.Scanner;

public class Q16_Shift_Multiplication_Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        System.out.print("Enter power of two exponent: ");
        int k = sc.nextInt();

        int multiplied = n << k;
        int divided = n >> k;

        System.out.println(n + " * 2^" + k + " = " + multiplied);
        System.out.println(n + " / 2^" + k + " = " + divided);

        sc.close();
    }
}
