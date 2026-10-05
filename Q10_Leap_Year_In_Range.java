import java.util.Scanner;

public class Q10_Leap_Year_In_Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();
        System.out.print("Enter range start: ");
        int start = sc.nextInt();
        System.out.print("Enter range end: ");
        int end = sc.nextInt();

        boolean leap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        boolean inRange = year >= start && year <= end;

        if (leap && inRange)
            System.out.println("Year is a leap year and lies within the range.");
        else
            System.out.println("Condition not satisfied.");

        sc.close();
    }
}
