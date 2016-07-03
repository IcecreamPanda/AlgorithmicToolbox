import java.util.*;

public class FibonacciHuge {
    private static long getFibonacciHuge(long n, long m) {

        List<Long> buf = new ArrayList<>();

        long f0 = 0;
        long f1 = 1;

        long nextmod;

        buf.add((long) 0);
        buf.add((long) 1);

        for (int i = 2; i < n; i++) {
            long nextfib = (f0 % m) + (f1 % m);
            nextmod = nextfib % m;
            buf.add(nextmod);
            f0 = f1;
            f1 = nextfib;
            if (f0 == 0 && f1 == 1) {
                break;
            }
        }

        return buf.get((int) (n % buf.size()));
    }

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


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        System.out.println(getFibonacciHuge(n, m));
    }
}

