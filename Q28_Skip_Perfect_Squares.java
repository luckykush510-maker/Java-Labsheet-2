public class Q28_Skip_Perfect_Squares {
    static boolean isPerfectSquare(int n) {
        int root = (int) Math.sqrt(n);
        return root * root == n;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (isPerfectSquare(i))
                continue;
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
