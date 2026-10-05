import java.util.Scanner;

public class Q17_Rotate_Left_Two_Bits {
    static int rotateLeft2(int value) {
        return Integer.rotateLeft(value, 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        int result = rotateLeft2(n);
        System.out.println("Original       = " + n);
        System.out.println("Rotated left 2 = " + result);
        System.out.println("Binary result  = " + Integer.toBinaryString(result));

        sc.close();
    }
}
