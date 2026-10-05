import java.util.Scanner;

public class Q11_Student_Pass_Logical_Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter theory percentage: ");
        double theory = sc.nextDouble();
        System.out.print("Enter practical percentage: ");
        double practical = sc.nextDouble();
        System.out.print("Enter overall percentage: ");
        double overall = sc.nextDouble();

        boolean pass = (theory >= 40 && practical >= 50) || overall >= 50;

        System.out.println(pass ? "PASS" : "FAIL");
        sc.close();
    }
}
