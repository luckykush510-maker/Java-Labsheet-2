import java.util.Scanner;

public class Q04_Prefix_Postfix_Counter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int visitors = 0;

        System.out.println("Visitor enters: " + (++visitors) + " (prefix increment)");
        System.out.println("Visitor enters: " + (visitors++) + " (postfix increment)");
        System.out.println("Count after entry = " + visitors);

        System.out.println("Visitor leaves: " + (--visitors) + " (prefix decrement)");
        System.out.println("Visitor leaves: " + (visitors--) + " (postfix decrement)");
        System.out.println("Count after leaving = " + visitors);

        sc.close();
    }
}
