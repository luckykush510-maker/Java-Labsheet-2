import java.util.Scanner;

public class Q15_Count_Set_Bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int value = n;
        int count = 0;

        while (value != 0) {
            count += value & 1;
            value >>>= 1;
        }

        System.out.println("Number of set bits = " + count);
        sc.close();
    }
}
