import java.util.Scanner;

public class Q01_Triangle_Area_Heron {
    static double area(double a, double b, double c) {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    static boolean validTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three sides: ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();

        if (validTriangle(a, b, c))
            System.out.println("Area = " + area(a, b, c));
        else
            System.out.println("Invalid triangle.");

        sc.close();
    }
}
