import java.util.Scanner;

public class Q13_Character_Type_Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        boolean alphabet = (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');
        boolean vowel = "AEIOUaeiou".indexOf(ch) >= 0;

        String type = (ch >= '0' && ch <= '9') ? "Digit"
                : alphabet ? (vowel ? "Vowel" : "Consonant")
                : "Special symbol";

        System.out.println(type);
        sc.close();
    }
}
