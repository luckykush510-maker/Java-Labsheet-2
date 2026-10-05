import java.util.Scanner;

public class Q26_Day_Weekday_Weekend_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day number (1-7): ");
        int day = sc.nextInt();

        switch (day) {
            case 1, 7 -> System.out.println("Weekend");
            case 2, 3, 4, 5, 6 -> System.out.println("Weekday");
            default -> System.out.println("Invalid day number.");
        }

        sc.close();
    }
}
