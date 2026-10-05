import java.util.Scanner;

public class Q02_Compound_Interest {
    static double compoundInterest(double p, double rate, double time) {
        double amount = p * Math.pow(1 + rate / 100.0, time);
        return amount - p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal: ");
        double p = sc.nextDouble();
        System.out.print("Enter annual rate (%): ");
        double r = sc.nextDouble();
        System.out.print("Enter time (years): ");
        double t = sc.nextDouble();

        double ci = compoundInterest(p, r, t);
        System.out.println("Compound Interest = " + ci);
        System.out.println("Amount = " + (p + ci));
        sc.close();
    }
}
