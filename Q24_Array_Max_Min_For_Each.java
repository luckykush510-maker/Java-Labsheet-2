import java.util.Scanner;

public class Q24_Array_Max_Min_For_Each {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int max = arr[0];
        int min = arr[0];

        for (int value : arr) {
            if (value > max) max = value;
            if (value < min) min = value;
        }

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
        sc.close();
    }
}
