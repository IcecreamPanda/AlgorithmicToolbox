import java.util.Scanner;

public class Fib {
    private static long calc_fib(int n) {
        if (n == 0) {
            return 0;
        }
        long[] buffer = new long[n + 1];

        buffer[0] = 0;
        buffer[1] = 1;
        if (n > 1) {
            for (int i = 2; i < n + 1; i++) {
                buffer[i] = buffer[i - 1] + buffer[i - 2];
            }
        }
        return buffer[n];
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(calc_fib(n));
    }
}
