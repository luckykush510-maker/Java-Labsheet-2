import java.util.Scanner;

public class Q09_Lexicographic_String_Comparison {
    static int compareStrings(String a, String b) {
        int min = Math.min(a.length(), b.length());

        for (int i = 0; i < min; i++) {
            char c1 = a.charAt(i);
            char c2 = b.charAt(i);

            if (c1 < c2) return -1;
            if (c1 > c2) return 1;
        }

        if (a.length() < b.length()) return -1;
        if (a.length() > b.length()) return 1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String a = sc.nextLine();
        System.out.print("Enter second string: ");
        String b = sc.nextLine();

        int result = compareStrings(a, b);

        if (result < 0)
            System.out.println("First string comes before second.");
        else if (result > 0)
            System.out.println("First string comes after second.");
        else
            System.out.println("Both strings are equal.");

        sc.close();
    }
}
