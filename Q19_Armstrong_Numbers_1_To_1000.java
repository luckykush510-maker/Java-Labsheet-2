public class Q19_Armstrong_Numbers_1_To_1000 {
    static boolean isArmstrong(int n) {
        int original = n;
        int digits = String.valueOf(n).length();
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += (int) Math.pow(digit, digits);
            n /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 1 and 1000:");
        for (int i = 1; i <= 1000; i++) {
            if (isArmstrong(i))
                System.out.print(i + " ");
        }
        System.out.println();
    }
}
