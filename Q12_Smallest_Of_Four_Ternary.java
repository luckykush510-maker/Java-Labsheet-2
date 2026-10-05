import java.util.Scanner;

public class Q12_Smallest_Of_Four_Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter four numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();

        int smallestAB = (a < b) ? a : b;
        int smallestCD = (c < d) ? c : d;
        int smallest = (smallestAB < smallestCD) ? smallestAB : smallestCD;

        System.out.println("Smallest = " + smallest);
        sc.close();
    }
}
